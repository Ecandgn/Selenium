package tests.day05_locators_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        /*
        Relative Locator selenium 4 ile tanıtılan yeni bir özellik
        Eğer
        birwebElement'i gördüğümüz ve HTML kodlarına ulaştığımız halde kullanmıyorsak
        Locate imiz çalışmıyor ve webElement'i kullanamıyorsak

        ve etrafında kullanabildiğimiz başka webElemnt varsa

        bu webElementi ulaştığımız bir bilgisi ve
        etrafındaki kullanabildiğimiz webElemntler sayesinde kullanabiliriz.
        WebElemnt abc=elemntin id'si "idABC" ve suResmin altında
         */

        System.setProperty("Webdriver.chrom", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1 ) https://testotomasyonu.com/relativeLocators adresine gidin
        driver.get("https://testotomasyonu.com/relativeLocators");


        // 2 ) DSLR Camera’yi etrafindaki elementleri kullanarak
        // 3 farkli relative locator ile locate edip tiklayin

        //relative locatori kullanmak için
        //A kullanmak istediğiniz webElemnt e ait bir locate bilgisi
        //<img id="pic7_thumb" src="https://testotomasyonu.com/uploads/product/1688040635pexels-pixabay-274973-removebg-preview.png" alt="">
        // bi id ="pic7_thumb" kullanalım
        //B etrafında kullanılabilecek bir webElemnte ihtiyacımız var
        WebElement appleKulaklik = driver.findElement(By.xpath("//*[@id='pic6_thumb']"));
        WebElement dslrCamera1 = driver.findElement(RelativeLocator.with(By.id("pic7_thumb")).toRightOf(appleKulaklik));

        dslrCamera1.click();

        // 3 ) Acilan urunun DSLR Camera oldugunu test edin.

        WebElement urunIsimElementi = driver.findElement(By.xpath("//div[@class=' heading-sm mb-4']"));
        String expectedIsim = "DSLR Camera";
        String actualisim = urunIsimElementi.getText();

        if (expectedIsim.equals(actualisim)) {
            System.out.println("DSLR camera testi PASSED");
        } else System.out.println("DSLR Testi FAILED");
        Thread.sleep(300);
        //_________________-------------
        driver.get("https://testotomasyonu.com/relativeLocators");

        //relative Locator için 2 bilgiye ihtiyaç var
        // A kullanmak istediğimiz web elementin locate bilgisine
        //biz tagName='img' kullanalım
        //B etrafında kullanbileceğimiz bir webElement

        WebElement batKulaklik = driver.findElement(By.id("pic2_thumb"));
        WebElement dslrCamera2 = driver.findElement(RelativeLocator.with(By.tagName("img"))
                .below(batKulaklik));
        dslrCamera2.click();
        //daha önceden locate edip kullandığımız webelenti başka sayfaya gittikten sonra yeniden kullanmak istediğimizde seleniım bize
        //o işlemin eski işlem olduğunu söyler

        urunIsimElementi = driver.findElement(By.xpath("//div[@class=' heading-sm mb-4']"));
        expectedIsim = "DSLR Camera";
        actualisim = urunIsimElementi.getText();

        if (expectedIsim.equals(actualisim)) {
            System.out.println("DSLR camera testi PASSED");
        } else System.out.println("DSLR Testi FAILED");


        Thread.sleep(300);
        driver.quit();

    }
}
