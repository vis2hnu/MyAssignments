package SeleInstall;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class SeleFirst {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		 ChromeDriver driver=new ChromeDriver(opt); 
		driver.get("http://leaftaps.com/opentaps/control/main"); 
		driver.manage().window().maximize();
		//input[@id='username']
		WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
		element.sendKeys("demosalesmanager");
		WebElement element1 = driver.findElement(By.xpath("//input[@id='password']"));
		element1.sendKeys("crmsfa");
		WebElement element2 = driver.findElement(By.xpath("//input[@value='Login']"));
		element2.click();
		//a[contains(text(),'CRM')]
		
		
		WebElement element3 = driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		element3.click();
		//a[text()='Leads']
		WebElement element4 = driver.findElement(By.xpath("//a[text()='Leads']"));
		element4.click();
		//a[text()='Create Lead']
		WebElement element5 = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		element5.click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		//input[@id='createLeadForm_firstName']
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vishnu");
		//input[@id='createLeadForm_lastName']
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Arumugam");
		//select[@id='createLeadForm_dataSourceId']
		//By using index in dropdown need to use Select 
		//1.Need to create webelement for the drop down
		WebElement element6 = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		//need to create obj fir select & pass the weblement as parameter
		Select s = new Select(element6);
		s.selectByIndex(4);
		WebElement element7 = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select s1 = new Select(element7);
		s1.selectByVisibleText("Automobile");
		WebElement element8 = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select s2 = new Select(element8);
		s2.selectByValue("OWN_CCORP");
		//input[@value='Create Lead']
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String a;
		Thread.sleep(5000);
		a=driver.getTitle();
		System.out.println(a);
		System.out.println("First & last name is Vishnu Arumugam");
		
		}
}
