package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class Activity8 {
    WebDriver driver;

    @Test
    public void homepage() throws InterruptedException {
        WebDriverManager.firefoxdriver();
        //Open a browser
        driver = new FirefoxDriver();
        //Navigate to ‘https://alchemy.hguy.co/jobs’.
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void login() {

        driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("root");
        driver.findElement((By.xpath("//*[@id=\"user_pass\"]"))).sendKeys("pa$$w0rd");
        driver.findElement(By.name("wp-submit")).click();

        driver.close();

    }
}