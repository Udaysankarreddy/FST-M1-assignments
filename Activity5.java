package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @Test
    public void homepage() {
        WebDriverManager.firefoxdriver();
        //Open a browser
        driver = new FirefoxDriver();
        //Navigate to ‘https://alchemy.hguy.co/jobs’.
        driver.get("https://alchemy.hguy.co/jobs");
        //Get the heading of the webpage
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();

        String acttitle = driver.getTitle();

        System.out.println(acttitle);
        String expTitle = "Jobs – Alchemy Jobs";
        if (acttitle.equals(expTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title not matched");

    }

    @AfterClass
    public void browserclose() {
        driver.close();
    }
}
