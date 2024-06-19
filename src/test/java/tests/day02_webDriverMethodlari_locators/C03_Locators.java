package tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Wepdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // test otomasyonu ana sayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //arama kutusunu locate edip bir wep element olarak kaydedin(Html elemnt )
        WebElement aramaKutusu=driver.findElement(By.id("global-search"));

        //arama kutusuna phone yazıp aratın
        aramaKutusu.sendKeys("phone");
        Thread.sleep(300);
        aramaKutusu.submit();

        Thread.sleep(3000);
        driver.quit();






    }
}
