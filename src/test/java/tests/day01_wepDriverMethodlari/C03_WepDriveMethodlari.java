package tests.day01_wepDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WepDriveMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getCurrentUrl()); //https://www.testotomasyonu.com/
        //driver in içinde olduğu sayfanın URL ni getirir

        System.out.println(driver.getTitle()); //Test Otomasyonu - Test Otomasyonu
        //driver içinde olduğu sayfanın title nı getirir

        //System.out.println(driver.getPageSource());
        //bütün sayfa kaynağını getirir


        System.out.println(driver.getWindowHandles());
        System.out.println(driver.getWindowHandle());

        /*
        getWindowHandle() driver içinde olduğu sayfaya atadığı
        unique WindowHandle() değeridir.

        eğer test sırasında birden fazla browser açılırsa
        açılan tüm sayfaların WindowHandle() de4ğerlerini
        bir set olarak bize getirir
         */

        Thread.sleep(200);
        driver.quit();
    }
}
