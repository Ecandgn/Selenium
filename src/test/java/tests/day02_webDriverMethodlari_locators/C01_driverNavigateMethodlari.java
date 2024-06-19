package tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com/");

        // url'in testotomasyonu içerdiğini test edin
        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Test Otomasyonu URL testi PASSED");
        } else {
            System.out.println("TEstotomasyonu URKL Testi FAİLED");
        }

        // youtube sayfasına gidin
        driver.navigate().to("https://www.youtube.com");

        //url in youtube içeriğini test edin
        expectedUrlIcerik = "youtube";
        actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Youtube URL testi PASSED");
        } else {
            System.out.println("Youtube URL Testi FAİLED");
        }
        Thread.sleep(3000);
        //yeniden test otomasyonu sayfasına dönün
        driver.navigate().back();
        Thread.sleep(3000);
        //titler in "Twst Otomasyonu " içeriğini test edin
        String expectedTitleIcerik = "testotomasyonu";
        String actualTitle = driver.getCurrentUrl();
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Test Otomasyon Title testi PASSED");
        } else {
            System.out.println("Test Otomasyon Title FAİLED");
        }
        Thread.sleep(3000);
        // bir daha youtube sayfasına gidin
        driver.navigate().forward();
        Thread.sleep(3000);
        // title in youtube içeriğini test edin
        expectedTitleIcerik = "Youtube";
        actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Youtube Title testi PASSED");
        } else {
            System.out.println("Yoputube Title Title FAİLED");
        }


        Thread.sleep(3000);
        driver.quit();


    }
}
