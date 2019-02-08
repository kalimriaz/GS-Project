package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_class
{

	static WebDriver driver;
	static String xpath= "/Users/kalimriaz/bin/chromedriver";
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", xpath);
		driver = new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://admin.dev.swipbox.com/user/login");
	  	driver.findElement(By.id("inputEmail")).sendKeys("kalim.riaz@gshare.dk");
	  	Thread.sleep(1000);
	  	driver.findElement(By.id("inputPassword")).sendKeys("k");
	  	Thread.sleep(1000);
	  	driver.findElement(By.id("submitBtn")).click();
	  	Thread.sleep(4000);
	  	//driver.findElement(By.className("dropdown-toggle")).click();
	  	//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/ul[1]/li[6]/a")).click();
	  	//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/ul[1]/li[1]/a")).click();
	  	//Thread.sleep(4000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/ul[1]/li[1]/ul/li[2]/a")).click();
		//driver.findElement(By.id("btnNew")).click();
		
		//driver.findElement(By.id("store_name")).sendKeys("Automation-PK Store");
		//driver.findElement(By.id("address")).sendKeys("PO Box 56");
		//driver.findElement(By.id("zipcode")).sendKeys("2026");
		//driver.findElement(By.id("city")).sendKeys("DK");
		//driver.findElement(By.id("phone_no")).sendKeys("DK");
		
	  
	  	
		driver.get("https://admin.dev.swipbox.com/pickup_point/manage_pickup_point");
		driver.findElement(By.id("btnNew")).click();
		
		Thread.sleep(1000);

	  	//WebElement mySelectElement = driver.findElement(By.id("hardware_version"));
	  	//Select dropdown1= new Select(mySelectElement);
	  	//dropdown1.selectByVisibleText("4.5");
		//Thread.sleep(1000);

		//driver.findElement(By.xpath("//*[@id='div_default']/div[2]/div/div/button/span[1]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\'div_default\']/div[2]/div/div/div/ul/li[3]/a")).click();
		
		
	  	WebElement mySelectElement_1 = driver.findElement(By.id("hardware_variant"));
	  	Select dropdown_2= new Select(mySelectElement_1);
	  	dropdown_2.selectByVisibleText("DHL Yellow");
		Thread.sleep(1000);

		driver.close();
	  	
	  	
	  	

	  	
	}

}
