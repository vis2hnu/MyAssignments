package SeleniumHomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

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
		dr.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//(//input[@name='companyName'])[2]
		dr.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		dr.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vishnu");
		dr.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Aru");
		dr.findElement(By.xpath("(//input[@maxlength='100'])[4]")).sendKeys("Vichunu");
		dr.findElement(By.xpath("(//input[@size='10' and @name='primaryPhoneExtension'])")).sendKeys("7092607445");
		dr.findElement(By.xpath("//input[@value='Create Lead']")).click();
		dr.findElement(By.xpath("//a[text()='Edit']")).click();
		dr.findElement(By.xpath("//textarea[@name='description']")).sendKeys("This lead is an updated version");
		dr.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(dr.getTitle());
		dr.close();
		}

}
