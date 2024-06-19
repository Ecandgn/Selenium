package tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_locators_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        // gerekli ayarları yapın
        System.setProperty("Webdriver.chrom.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //test otomasyon anasayfasına gidin
        driver.get("https://www.testotomasyonu.com");

        //arama kutusunu locate edip
        WebElement aramaKutusau = driver.findElement(By.id("global-search"));


        //dress için arama yapın
        aramaKutusau.submit();

        // bulunan ürün sayısının 3 den fazla olduğunu test edin

        // arama sonuç yazısını bir wepelement olarak kaydedelim
        WebElement sonucYaziElemnti = driver.findElement(By.className("product-count-text"));

        System.out.println(sonucYaziElemnti);
        //WebElemnt ler direk olarak yazdırılamazlar
        //eğer webElemntler üzerindeki yazıya ulaşmak istersek

        String actualSonucYazısı = sonucYaziElemnti.getText(); // 10 Products Found
        actualSonucYazısı = actualSonucYazısı.replaceAll("\\D", "");
        int bulunanSonucSayisi = Integer.parseInt(actualSonucYazısı);

        if (bulunanSonucSayisi > 3) {
            System.out.println("dress arama testi passed");

        } else System.out.println("dress arama testi Fail");

        // ikinci bir yöntem ile test edelim
        List<WebElement> bulunanUrunResimleriList = driver.findElements(By.className("prod-img"));
        if (bulunanUrunResimleriList.size()>3){
            System.out.println("2. yöntemle dress arama testi PASASED");
        }else System.out.println("2. yöntemle dress arama testi FAİLED");



            //sayfayı kapatın
            Thread.sleep(3000);
        driver.quit();
    }

}
