package seleniumjavaproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOpJavaProject2 
{
	
		public WebDriver openBrowser() 
		{
			WebDriver driver2 = new ChromeDriver();
			
	        driver2.get("https://naveenprojects.blogspot.com/2023/08/");
			return driver2;
}
}
