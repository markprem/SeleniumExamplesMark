package selenium.mark;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2 
{
    public static void main(String[] args) 
    
    {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://selenium.dev");

        //driver.quit();
    }
}