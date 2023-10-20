package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;

    @Test
    public void homepage() throws InterruptedException {
        WebDriverManager.firefoxdriver();
        //Open a browser
        driver = new FirefoxDriver();
        //Navigate to ‘https://alchemy.hguy.co/jobs’.
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"search_keywords\"]")).sendKeys("Banking");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]/a/div[1]/div")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"post-5867\"]/div/div/div/div[3]/input")).click();
        Thread.sleep(2000);

        String Email = driver.findElement(By.xpath("//*[@id=\"post-5867\"]/div/div/div/div[3]/div/p/a")).getText();

        System.out.println(Email);

    }

    public void close() {
        driver.close();
    }
}