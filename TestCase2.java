package MarathonSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//input[@id='twotabsearchtextbox']
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys",Keys.ENTER);
		//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']
		WebElement d=driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
		String s=d.getText();
		System.out.println(s);
		
		//driver.findElement(By.id("//div[@id='brandsRefinements']"))
		// (//div[@id='brandsRefinements']/ul/span/span)[1]
		// (//div[@id='brandsRefinements']/ul/span/span//span)[1]
	//	Thread.sleep(5000);
	//	(//div[@id='brandsRefinements']//ul//li//i)[1]
		//driver.findElement(By.xpath("(//div[@id='brandsRefinements']/ul/span/span//span)[1]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	driver.findElement(By.xpath("(//div[@id='brandsRefinements']/ul//li//i)[2]")).click();
	//	(//div[@id='brandsRefinements']//ul[@role='heading']//li//i[@class='a-icon a-icon-checkbox'])[1]
		//span[@id='a-autoid-0-announce']
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul//li//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		//(//ul[@class='a-nostyle a-list-link']/li/a[contains(text(),'Newest')])[2]
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='a-nostyle a-list-link']/li/a[contains(text(),'Newest')]")).click();
		Thread.sleep(3000);
		String s2 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println(s2);
		String s1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(s1);
		
		

	/*	WebElement e = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select ss = new Select(e);
		ss.selectByValue("Newest Arrivals");*/
		
		//i[@class='a-icon a-icon-dropdown']
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Newest Arrivals'])[2]/parent::li")));
		button.click();*/
		//driver.findElement(By.xpath("(//a[text()='Newest Arrivals'])[2]/parent::li")).click();
		
		//driver.close();
		// (//span[@class='a-size-base-plus a-color-base'])[1] 
		// (//span[@class='a-price-whole'])[1]
		
	}

}
