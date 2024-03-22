package seleniumjavaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOpJavaProject 
{
	public WebDriver openBrowser() 
	{
		WebDriver driver = new ChromeDriver();
		
        driver.get("http://naveenprojects.blogspot.com/2023/09/selenium-with-java.html");
		return driver;
        
       
	}
}
