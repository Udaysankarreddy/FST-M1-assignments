package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @Test
    public void homepage() {
        WebDriverManager.firefoxdriver();
        //Open a browser
        driver = new FirefoxDriver();
        //Navigate to ‘https://alchemy.hguy.co/jobs’.
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.xpath("//*[@id=\"search_keywords\"]")).sendKeys("Banking");
        //Get the title of the website
        String ActualTitle = driver.getTitle();
        String expectedTitle = "Alchemy Jobs – Job Board Application";
        System.out.println("The title of the page is " + ActualTitle);
        //Make sure it matches “Alchemy Jobs – Job Board Application” exactly
        if (ActualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");
        //If it matches, close the browser

        //driver.close();

    }

}
