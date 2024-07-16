package tests.day04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("Webdriver.chrom.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com/");

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        // aramaKutusu.sendKeys("phone");  Webelemente yazı yollar
        //aramaKutusu.click(); web element'e click yapar
        //aramaKutusu.getText(); webelemnet üzerindeki texti alır
        //aramaKutusu.submit(); webelement de Enter basmak ile aynı işlemi yapar
        //aramaKutusu.clear(); web elementte yazı varsa siler
        //System.out.println(aramaKutusu.isDisplayed()); // tru-false web element gorunuyor mu sorusunun cevabını verir
        //System.out.println(aramaKutusu.isEnabled()); // true/false webelemnt görünüyormu sorusunun cevabını verir
       // System.out.println(aramaKutusu.isSelected()); // true-false webelement checbox veya radio button ise seçili mi sorusunun cevabını verir.
        System.out.println(aramaKutusu.getAttribute("id")); //global-search
        System.out.println(aramaKutusu.getAttribute("class")); // search-input
        System.out.println(aramaKutusu.getAttribute("naber")); //null



        Thread.sleep(300);
        driver.quit();

    }
}
