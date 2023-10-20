package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @Test
    public void homepage() {
        WebDriverManager.firefoxdriver();
        //Open a browser
        driver = new FirefoxDriver();
        //Navigate to ‘https://alchemy.hguy.co/jobs’.
        driver.get("https://alchemy.hguy.co/jobs");
        //Get the heading of the webpage

        String Actualheader = driver.findElement(By.xpath("//*[@id=\"post-16\"]/div/h2")).getText();
        //String Actualheader = driver.findElement(By.className("entry-title")).getText();
        System.out.println(Actualheader);
        String expectedHeader = "Quia quis non";
        if (Actualheader.equals(expectedHeader))
            System.out.println("Header Matched");
        else
            System.out.println("Header not matched");

    }

    @AfterClass
    public void browserclose(){
        driver.close();
    }
}
