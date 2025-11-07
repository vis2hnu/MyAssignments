package SeleniumHomeAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccountLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 18th sept Assignment 
		//demosalesmanager demosalesmanager
		//crmsfa
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement s = driver.findElement(By.id("username"));
		s.sendKeys("demosalesmanager");
		WebElement s1= driver.findElement(By.id("password"));
		s1.sendKeys("crmsfa");
		WebElement s3 = driver.findElement(By.xpath("//input[@type='submit']"));
	    s3.click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	    driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	    driver.findElement(By.id("accountName")).sendKeys("TestLeafStudent");
	    driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
	    driver.findElement(By.name("numberEmployees")).sendKeys("12");
	    driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    System.out.println(driver.getTitle());
	    driver.quit();
	    
	   
	    
	    
		
		
	}

}
