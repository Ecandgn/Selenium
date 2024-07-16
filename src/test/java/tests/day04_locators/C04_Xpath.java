package tests.day04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrom.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://www.testotomasyonu.com/addremove/");

        //2- Add Element butonuna basin
        // WebElement addButonu = driver.findElement(By.xpath("//button[@id='sub-btn']"));
        // addButonu.click();
        driver.findElement(By.xpath("//button[@id='sub-btn']")).click();


        //3- Remove butonu’nun gorunur oldugunu test edin
        WebElement removeButonu = driver.findElement(By.xpath("//button[@class='remove-btn']"));

        if (removeButonu.isDisplayed()) {
            System.out.println("remove butonu görünme testi PASSED");
        } else System.out.println("Remove testi FAİLED");


        //4- Remove tusuna basin
        removeButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
       // WebElement addRemoveYazıElemnt=driver.findElement(By.xpath("//h2"));
        WebElement addRemoveYazıElemnt = driver.findElement(By.tagName("h2"));
        if (addRemoveYazıElemnt.isDisplayed()) {
            System.out.println("Add remove yazısı görünme testi PASSED");
        } else System.out.println("Add remove yazısı görünme testi FAİLED");
        Thread.sleep(3000);
        driver.quit();
    }
}
