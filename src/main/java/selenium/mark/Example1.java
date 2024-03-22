package selenium.mark;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 
{
    public static void main(String[] args) {
        
    	String url = "https://en-gb.facebook.com";
    	
    	WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver = new FirefoxDriver();
        driver.get(url);
        
        driver = new EdgeDriver();
        driver.get(url);
    }
}