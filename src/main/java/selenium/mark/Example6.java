package selenium.mark;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6 {

	public static void main(String[] args) 
	{
		
		String url = "https://en-gb.facebook.com";
		System.setProperty("webdriver.chrome.driver", "path");
		
    	WebDriver driver = new ChromeDriver();
        driver.get(url);
	}

}
