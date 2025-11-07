package SeleniumHomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver dr = new ChromeDriver(opt);
		dr.get("http://leaftaps.com/opentaps/");
		dr.manage().window().maximize();
		dr.findElement(By.id("username")).sendKeys("demosalesmanager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.findElement(By.xpath("//input[@type='submit']"));
		dr.findElement(By.xpath("//input[@type='submit']")).click();
		dr.findElement(By.xpath("//a[@style='color: black;']")).click();
		dr.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		dr.findElement(By.xpath("//a[text()='Find Leads']")).click();
		dr.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		dr.findElement(By.name("phoneNumber")).sendKeys("7092607445");
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//dr.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[text()='11583']")).click();
		dr.findElement(By.xpath("//a[text()='Delete']")).click();
		dr.findElement(By.xpath("//a[text()='Find Leads']")).click();
		dr.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		dr.findElement(By.name("phoneNumber")).sendKeys("100000000");
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement element1 = dr.findElement(By.xpath("//div[@class='x-paging-info']"));
		if(element1.isDisplayed())
		{
			System.out.println("No records");
		}
		else
		{
			System.out.println("There is records");
		}
		
		
	}

}
