package SeleniumHomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GbFaceBook {
	public static void main(String args[])
	{
	 ChromeDriver dr = new ChromeDriver();	
	 dr.get("https://en-gb.facebook.com/");
	 dr.manage().window().maximize();
	 dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 dr.findElement(By.xpath("//a[text()='Create new account']")).click();
	//input[@name='firstname']
	 //input[@name='lastname']
	 dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
	dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Leaf");
	WebElement ele1 = dr.findElement(By.id("day"));
	Select s = new Select(ele1);
	s.selectByValue("24");
	WebElement ele2 = dr.findElement(By.id("month"));
	Select s1 = new Select(ele2);
	//s1.selectByValue("10");
	s1.selectByVisibleText("Oct");
	WebElement ele3 = dr.findElement(By.id("year"));
	Select s2 = new Select(ele3);
	s2.selectByValue("2000");
	dr.findElement(By.xpath("//label[text()='Male']")).click();
	dr.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("testleasf@gmail.com");
	dr.findElement(By.xpath("//input[@type='password']")).sendKeys("qaggle");
	
	
	}
}
