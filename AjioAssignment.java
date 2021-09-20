package Week3Day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='facets']//label[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		WebElement Number=driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println(Number.getText());
		
		
		List<WebElement> Brands=driver.findElements(By.xpath("//div[@class='brand']"));
		int size=Brands.size();
		System.out.println(size);
		
		for(WebElement webelement : Brands)
		{
			System.out.println("Brands Listed :  "+ webelement.getText());
		}
		List<String> BrandName=new ArrayList<String>();
		for (WebElement element : Brands) {
		     if (!BrandName.contains(element.getText()))
		    	 BrandName.add(element.getText());
		}
		System.out.println("Removing Duplicates");
		for(String DupBrandRem : BrandName)
		{
			System.out.println("Brands :  "+ DupBrandRem);
		}
		
		List<WebElement> ProdName=driver.findElements(By.xpath("//div[@class='name']"));
		int sizeOfProdName=ProdName.size();
		System.out.println(sizeOfProdName);
		
		
		for(WebElement webelement : ProdName)
		{
			System.out.println("Brands Listed :  "+ webelement.getText());
		}
		
	}

}
