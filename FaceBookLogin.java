package Selenium.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.facebook.com/");
		c.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		c.findElement(By.id("pass")).sendKeys("Tuna@321");
		c.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
		
	}

}
