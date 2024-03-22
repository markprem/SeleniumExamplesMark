package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.google.co.uk/");
        
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium Dev");
        
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1]")).click();
        
	}
}
