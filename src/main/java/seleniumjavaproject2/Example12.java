package seleniumjavaproject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example12 extends BasicOpJavaProject2

{
	public void selWithJava2() throws InterruptedException
	{
		WebDriver driver = openBrowser();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("cookieChoiceDismiss")).click();
		
		driver.findElement(By.id("//*[@id=\"post-body-8066730700853217911\"]/table/tbody/tr[1]/td[2]/input")). sendKeys("Mark");
		
		driver.findElement(By.id("floatingTextarea")).sendKeys("My Example");
		
		driver.findElement(By.id("b1")). click();
		
		
		
		
	}
}
