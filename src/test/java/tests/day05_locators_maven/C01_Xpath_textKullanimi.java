package tests.day05_locators_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath_textKullanimi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Wedriver.chrom.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //  1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");
        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add']")).click();

        // 3- Remove butonu’nun gorunur oldugunu test edin
        WebElement removeButonu = driver.findElement(By.xpath("//*[text()='Remove']"));
        if (removeButonu.isDisplayed()) {
            System.out.println("remove buton gorunme testi PASSED");
        } else {
            System.out.println("remove buton görünme testi FAILED");
        }
        // 4- Remove tusuna basin
        removeButonu.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElemti = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveYaziElemti.isDisplayed()) {
            System.out.println("Add/Remove yazısı gorunme testi PASSED");
        } else {
            System.out.println("Add/Remove yazısı görünme testi FAILED");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
