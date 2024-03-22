package seleniumjavaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example11 extends BasicOpJavaProject
	{

	public void selWithJava() throws InterruptedException
	{
		WebDriver driver = openBrowser();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("cookieChoiceDismiss")).click();
		
		driver.findElement(By.id("one")). sendKeys("12345");
		
		driver.findElement(By.name("inputname")). sendKeys("Mark");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[3]/td/input")). sendKeys("markprem@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[4]/td/input")). sendKeys("07425887993");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[5]/td[1]/input")).sendKeys("markprem");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[5]/td[2]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[6]/td[2]/input")). sendKeys("hello");
	
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[7]/td[2]/input[1]")). sendKeys("text1");
	
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[7]/td[2]/input[2]")). sendKeys("text2");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[7]/td[2]/input[3]")). sendKeys("text3");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-8618763667421143981\"]/table/tbody/tr[8]/td[2]/input")). click();
		//hello Naveen!... your system will blast now
	}
}
