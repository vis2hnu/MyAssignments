package MarathonSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver a= new ChromeDriver();
		a.get("https://www.pvrcinemas.com/");
		a.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//div[@class='show-desktop-view']
		a.findElement(By.xpath("//div[@class='show-desktop-view']")).click();
		
		//(//span[text()='Chennai'])[3]
		a.findElement(By.xpath("(//span[text()='Chennai'])[3]")).click();
		
		
		//span[text()='Cinema']
		a.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		//span[text()='Select Cinema']
		a.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		//span[text()='INOX National,Virugambakkam Chennai']
		a.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		
		//   (//ul[@Class='p-dropdown-items']//span)[2]
		WebElement w =a.findElement(By.xpath("//span[text()='Tomorrow']"));
		//Thread.sleep(1000);
		w.click();
		
		
		// (//li[@Class='p-dropdown-item'])[5]
		a.findElement(By.xpath("(//li[@Class='p-dropdown-item'])[4]")).click();
		// (//li[@Class='p-dropdown-item'])[3]
		 a.findElement(By.xpath("//li[@Class='p-dropdown-item']//span[contains(text(),':')]")).click();
		// (//div[@class='quick-left'])[4]
		a.findElement(By.xpath("//span[text()='Book']/parent::button[@type='submit']")).click();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//button[text()='Accept']
		a.findElement(By.xpath("//button[text()='Accept']")).click();  
		// (//td[@class='seats-col'])[2]
		a.findElement(By.xpath("(//td[@class='seats-col']//span[@class='seat-current-pvr'])[1]")).click();
		//button[text()='Proceed']
		a.findElement(By.xpath("//button[text()='Proceed']")).click();
		//div[@class='seat-info']
		WebElement b= a.findElement(By.xpath("//div[@class='seat-info']"));
		System.out.println(b.getText());
		
		//div[@class='grand-prices']
		WebElement c = a.findElement(By.xpath("//div[@class='grand-prices']"));
		System.out.println(c.getText());
		String s;
		s=a.getTitle();
		System.out.println("Title" + s);
		a.quit();
		
		
		
	}

}
