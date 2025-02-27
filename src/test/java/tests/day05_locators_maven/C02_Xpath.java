package tests.day05_locators_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrom.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");
        // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        // 5- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title Testi PASSED");
        } else System.out.println("Title testi FAILED");
        // 6- Furniture linkine tiklayin
        driver.findElement(By.xpath("(//a[text()='Furniture'])[3]")).click();

        // 7- price range filtresinde min degere 40, max degere 200 yazip filtreleyin
        WebElement minTutarKutusu = driver.findElement(By.xpath("//input[@name='min']"));
        WebElement maxTutarKutusu = driver.findElement(By.xpath("//input[@name='max']"));


        minTutarKutusu.clear();
        minTutarKutusu.sendKeys("40");
        maxTutarKutusu.clear();
        maxTutarKutusu.sendKeys("200" + Keys.PAGE_DOWN);
        Thread.sleep(500);
        //değer yolladıktan sonra filtre butonuna basalim
        driver.findElement(By.xpath("//input[@name='min']")).click();

        // 8- filtreleme sonucunda urun bulunabildigini test edin
        List<WebElement> bulunanSonucElementleriListesi = driver
                .findElements(By.xpath("//*[@*='product-box mb-2 pb-1']"));
        if (bulunanSonucElementleriListesi.size()>0){
            System.out.println("Filtreleme Testi PASSED");

        }else System.out.println("Filtreleme Testi FAILED");
        Thread.sleep(500);

        // 10-Ilk urunu tiklayin
        bulunanSonucElementleriListesi.get(0).click();

        // 11- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin
        WebElement ilkUrunFiyatElementi= driver.findElement(By.xpath("//span[@id='priceproduct']"));
        String urunFiyatiStr=ilkUrunFiyatElementi.getText().replaceAll("\\D","");
        double urunFiyati=Double.parseDouble(urunFiyatiStr)/100;
        if (urunFiyati>=40 && urunFiyati<=200){
            System.out.println("Urun Fiyat Testi PASSED");
        }else {
            System.out.println("Urun Fiyat Testi FAILED");
        }

        // 12-Sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();
    }
}
