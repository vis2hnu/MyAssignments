package SeleniumHomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectCreateAccountCRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
	    driver.findElement(By.id("accountName")).sendKeys("TestLeafStudent3");
	    driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
	    WebElement ele = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	    Select ss = new Select(ele);
	    ss.selectByContainsVisibleText("Computer Software");
	    WebElement ele1 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	    Select ss1 = new Select(ele1);
	    ss1.selectByContainsVisibleText("S-Corporation");
	    WebElement ele2 = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
	    Select ss2= new Select(ele2);
	    ss2.selectByIndex(4);
	    WebElement ele3 = driver.findElement(By.id("marketingCampaignId"));
	    Select ss3 = new Select(ele3);
	    ss3.selectByValue("9000");
	    WebElement ele4 = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select ss4 = new Select(ele4);
	    ss4.selectByValue("TX");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    System.out.println("Account name should be unique");
	    String Accountname = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
	    System.out.println(Accountname);
	    driver.close();	    
	    

	}

}
