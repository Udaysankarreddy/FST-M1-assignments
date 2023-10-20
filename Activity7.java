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

public class Activity7 {
    WebDriver driver;

    @Test
    public void homepage() throws InterruptedException {
        WebDriverManager.firefoxdriver();
        //Open a browser
        driver = new FirefoxDriver();
        //Navigate to ‘https://alchemy.hguy.co/jobs’.
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void postjob() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/form/fieldset[2]/div/input")).sendKeys("test1uu@test.com");
        driver.findElement(By.xpath("//*[@id=\"job_title\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"job_location\"]")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//*[@id=\"job_type\"]/option[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"job_description_ifr\"]")).sendKeys("mari");
        // driver.findElement(By.xpath("/html")).sendKeys("Test job ded");
        driver.findElement(By.xpath("//*[@id=\"application\"]")).sendKeys("https://google.com");
        driver.findElement(By.xpath("//*[@id=\"company_name\"]")).sendKeys("maran");
        driver.findElement(By.xpath("//*[@id=\"company_website\"]")).sendKeys("https://google.com");
        driver.findElement(By.xpath("//*[@id=\"company_tagline\"]")).sendKeys("Mark your life as a brand");
        driver.findElement(By.xpath("//*[@id=\"company_video\"]")).sendKeys("https:link");
        driver.findElement(By.xpath("//*[@id=\"company_twitter\"]")).sendKeys("//https:uday/ln.in");
        WebElement browse = driver.findElement(By.xpath("//*[@id=\"company_logo\"]"));
        browse.sendKeys("C:\\Users\\002FLD744\\Pictures\\Screenshots\\ss.png");
        System.out.println("File is Uploaded Successfully");
        driver.findElement(By.xpath("//*[@id=\"submit-job-form\"]/p/input[4]")).click();

        driver.findElement(By.xpath("//*[@id=\"job_preview_submit_button\"]")).click();
        //job
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"search_keywords\"]")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]/a/div[1]/div")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"post-5867\"]/div/div/div/div[3]/input")).click();

        driver.close();
    }

}