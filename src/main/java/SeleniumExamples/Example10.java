package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example10 extends FlexQuizBasicOp
{

	public void signUp() throws InterruptedException
	{
		WebDriver driver = openBrowser();
		
		driver.findElement(By.id("fq-main-menu-auth")).click();
		
		Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")). click();
        
        driver.findElement(By.id("signupEmail")).sendKeys("markprem@gmail.com");

        driver.findElement(By.id("signupPassword")).sendKeys("Mpk12345");
        
        driver.findElement(By.id("signupNow")).click();

	}
	

		public void products() 
		{
			WebDriver driver = openBrowser();
			
			driver.findElement(By.xpath("//*[@id=\"fq-main-menu-item-product\"]/a"));

		}

		public void pricing() 
		{
			WebDriver driver = openBrowser();
			
			driver.findElement(By.xpath("//*[@id=\"fqo-main-menu-item-pricing\"]/a"));

		}

}
