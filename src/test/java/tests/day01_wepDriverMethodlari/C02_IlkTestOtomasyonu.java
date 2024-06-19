package tests.day01_wepDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C02_IlkTestOtomasyonu {
    public static void main(String[] args) {

        // gerekli ayarları yapıp
        System.setProperty("Wepdrivewr.chrom.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //testotomasyon anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");


        //testotomasyon anasayfasının açıldığını test etmek için
        //açılan sayfanınn url'inin "https://www.testotomasyonu.com/" olduğunu test edin

        String exceptedUrl = "https://www.testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();

                /*
                bir test yapabilmek için
                excepted değer ile actual değeri karşılaştırırz
                expected değer testcase yazılırken mantık olarak karşılaştırmayı beklediğimiz değerdir.
                actual değer ise driver in ulaştığı değerdir.

                 */
if (exceptedUrl.equals(actualUrl)){
    System.out.println("Test PASSED");
}else {
    System.out.println("Test FAILD");
    System.out.println("Excepted url : " + exceptedUrl);
    System.out.println("Actual url : " + actualUrl);
}
        //sayfayı kapatın
        driver.quit();

    }
}
