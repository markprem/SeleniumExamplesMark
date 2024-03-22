package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.flexiquiz.com/");
        
        driver.findElement(By.id("fq-main-menu-auth")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")). click();
        
        driver.findElement(By.id("signupEmail")).sendKeys("markprem@gmail.com");

        driver.findElement(By.id("signupPassword")).sendKeys("Mpk12345");
        
        driver.findElement(By.id("signupNow")).click();
	}

}
