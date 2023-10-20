package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @Test
    public void homepage() {
        WebDriverManager.firefoxdriver();
        //Open a browser
        driver = new FirefoxDriver();
        //Navigate to ‘https://alchemy.hguy.co/jobs’.
        driver.get("https://alchemy.hguy.co/jobs");
        //Get the heading of the webpage

        //get the image url
        WebElement I = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/div/img"));
        System.out.println("Src attribute is " + I.getAttribute("src"));

        driver.close();
    }
}
