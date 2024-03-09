package selenium.mark;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;

public class Example5 
{
    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();

        driver.get("https://selenium.dev");

        //driver.quit();
    }
}