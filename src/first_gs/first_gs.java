package first_gs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class first_gs
{
	static WebDriver driver;
	static String driverPath = "c:\\Selenium_drivers\\geckodriver.exe";
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://www.facebook.com");
	  	
	  /*	Thread.sleep(1000);
	  	WebElement mySelectElement_day = driver.findElement(By.id("day"));
	  	Select dropdown= new Select(mySelectElement_day);
	  	dropdown.selectByVisibleText("12");
	  	
	  	
	  
	  	WebElement mySelectElement_month = driver.findElement(By.id("month"));
	  	Select dropdown_month= new Select(mySelectElement_month);
		Thread.sleep(1000);
		dropdown_month.selectByVisibleText("Aug");
	 
		
		WebElement mySelectElement_year = driver.findElement(By.id("year"));
	  	Select dropdown_year= new Select(mySelectElement_year);
		Thread.sleep(1000);
		dropdown_year.selectByVisibleText("1998"); */
	
	
	   //driver.findElement(By.id("day")).click();
	   //driver.findElement(By.xpath("//*[@id='day']/option[8]")).click();
		
	   //driver.findElement(By.id("month")).click();
	   //driver.findElement(By.xpath("//*[@id='day']/option[9]")).click(); 
	   
	   try {
		   Thread.sleep(1000);
		  } catch (InterruptedException e1) {
		   // TODO Auto-generated catch block
		   e1.printStackTrace();
		  }
		  WebElement month_dropdown = driver.findElement(By.id("month"));
		  Select month = new Select(month_dropdown);
		  month.selectByVisibleText("Aug");
		  try {
		   Thread.sleep(1000);
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch bloc
		   e.printStackTrace();
		  } 
		  
		  
		  WebElement day_dropdown = driver.findElement(By.id("day"));
		  Select day = new Select (day_dropdown);
		  day.selectByVisibleText("10");
		  
		  WebElement year_dropdown = driver.findElement(By.id("year"));
		  Select year = new Select(year_dropdown);
		  year.selectByVisibleText("2000");
	}
}
