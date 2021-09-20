package Week3Day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement fromStation=driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MS",Keys.ENTER);
		
		WebElement toStation=driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU",Keys.ENTER);
		
		WebElement date=driver.findElement(By.id("chkSelectDateOnly"));
		date.click();
		Thread.sleep(3000);
		List<WebElement> TrainNo=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
		int size=TrainNo.size();
		System.out.println("The Number Of Trains Listed Are:  "+size);
		
		
		
		for(WebElement webelement : TrainNo)
		{
			System.out.println("Train Number  :  "+ webelement.getText());
		}
		
		Set<WebElement> nameOfTrain = new HashSet<WebElement>(TrainNo);
		
		for (WebElement TrainNumber : nameOfTrain ) 
		{
			  System.out.println("Train Number Stored in Hashset  : "+TrainNumber.getText());
		}
		
	/*	LinkedHashSet<WebElement> linkedHashSet
        = new LinkedHashSet<WebElement>(TrainNo);
		
		
		for(WebElement  WebElementHash :linkedHashSet)
		{
		System.out.println("LinkedHashSet"+WebElementHash);
		}
	/*	for(int i=0;i<size;i++)
		{
			String name=TrainNo.get(i).getText();
			System.out.println("Train Number : "+name);
		}
	*/
	}
	}


