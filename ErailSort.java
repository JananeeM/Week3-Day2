package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

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
		List<WebElement> TrainName=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		int size=TrainName.size();
		System.out.println("The Number Of Trains Listed Are:  "+size);
		
		for(WebElement webelement : TrainName)
		{
			System.out.println("Train Name  :  "+ webelement.getText());
		}
		
		
		List<String> NameOfTrain=new ArrayList<String>();
		for(WebElement ListOfTrain:TrainName)
		{
			String name=ListOfTrain.getText();
			NameOfTrain.add(name);
		}
		Collections.sort(NameOfTrain);
		System.out.println("Sorted Train Name  :");
		for(String ListOfTrain:NameOfTrain)
		{
			System.out.println(ListOfTrain);
		}
		
		
		
	}

}
