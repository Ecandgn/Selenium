import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniımilktest {
    public static void main(String[] args) {
        System.setProperty("wepdrive.chrom.driver", "src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

    }
}
