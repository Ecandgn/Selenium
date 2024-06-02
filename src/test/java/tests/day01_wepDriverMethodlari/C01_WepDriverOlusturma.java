package tests.day01_wepDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_WepDriverOlusturma {
    public static void main(String[] args) throws InterruptedException {
        // biz wep de yapacağımız tüm testler için webDriver objesine ihtiyaç  duyarız
        //wepDriver objesi bizim için çok önemlidir.
        //dolayısı ile test yazacaksak Önce wepDriver objesi oluşturmalıyız.

        System.setProperty("Wepddriver.chrom.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        selenium 4 ile birlikte selenium
        kendi wepDriver ını kodların "içine koydu
        selenium 4 sonrası yukarıdaki 13. satırda yazdığımız driver ayarı opsiyonel hale geldi
         */
        //testotomasyonu ana sayfayaq gidin

        driver.get("https://www.testotomasyonu.com");
        // 5 saniye bekleyin
        Thread.sleep(5000);
        //sayfayi kapatın
        driver.quit();

        /*
        WebDriver driver = new ChromeDriver();
        yazdığımız wepDrive objesini kapatır
        alternatif olarak kapatmak için driver.close(); komutuda kullanılabilir ancak
        üzerinde çalıştığı tek bir browser i kapatır.
         driver.quit(); ise test sırasında birden fazla  browser açıldı ise açtığı tüm browser ları kapatır.

         */

    }
}
