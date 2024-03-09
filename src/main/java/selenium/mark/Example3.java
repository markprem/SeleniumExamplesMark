package selenium.mark;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Example3 
{
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.get("https://selenium.dev");

        //driver.quit();
    }
}