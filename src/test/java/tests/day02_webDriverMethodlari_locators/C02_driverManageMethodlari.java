package tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        Bir wep sayfası ne kadar çok data barındırırsa
        serverdan o dataların client tarafına yollanması o kadar uzun sürecektir.

        bizim istediğimiz webelemntleri zaman alacaktır.
        bu geçikme kodumuzun dinamik olarak beklemesini sağlamak için
        implicitlyWait tanımlarız

        implicitlyWait içerisine yazdığımız 10 sn max bekleme süresidir.

        eğer 10 sn den önce sayfa yüklenir veya aranan wepelemnt bulunur ise
        kodlar çalışmaya devam eder
        10 saniye beklediğimiz halde sayfa açılmaz
        veya aradığımız wepelemnt bulunmazsa
        exection firlatıp çalışmayı durdurur. 

         */


        System.setProperty("WebDriver.chrom.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        System.out.println("Maximize Konum :" + driver.manage().window().getPosition());
        System.out.println("Maximize Sİze : " + driver.manage().window().getSize());

        Thread.sleep(4000);

        driver.manage().window().fullscreen();
        System.out.println("Full screen Konum :" + driver.manage().window().getPosition());
        System.out.println("Full screen Sİze : " + driver.manage().window().getSize());
        Thread.sleep(4000);

        driver.manage().window().minimize();
        System.out.println("Minimize Konum :" + driver.manage().window().getPosition());
        System.out.println("Minimize Sİze : " + driver.manage().window().getSize());

        //browaser in başlngıç noktasını 300,300
        //boyutunu da 500,500 yapin

        driver.manage().window().setPosition(new Point(300, 300));
        driver.manage().window().setPosition(new Point(500, 500));
        Thread.sleep(500);

        System.out.println("Ozel ölçü için  Konum :" + driver.manage().window().getPosition());
        System.out.println("Ozel ölçü için  Sİze : " + driver.manage().window().getSize());

        Thread.sleep(4000);

        driver.quit();


    }
}
