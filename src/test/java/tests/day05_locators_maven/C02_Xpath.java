package tests.day05_locators_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrom.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // 2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");
       // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
       // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
       // 5- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
       // 6- Furniture linkine tiklayin
       // 7- price range filtresinde min degere 40, max degere 200 yazip filtreleyin
       // 8- filtreleme sonucunda urun bulunabildigini test edin
       // 10-Ilk urunu tiklayin
       // 11- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin
       // 12-Sayfayi kapatin
    }
}
