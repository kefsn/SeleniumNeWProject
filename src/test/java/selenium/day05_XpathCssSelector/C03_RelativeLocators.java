package selenium.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;



public class C03_RelativeLocators {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        /*
        -Bir web elementi direk locate edemediğimiz durumlarda,
        o web element,, etrafındaki web elementleri ile tarif etmemizi sağlar.
        -Bir web sayfasında benzer özelliklere sahip webelementlerin olduğu durumlarda kulllanılabilir.

        -above ==> Belirtilen elementin üstünde olan elementi seçer.
        -below==> Belirtilen elementin altında olan elemneti seçer.
        -toLeftOf ==> Belirtilen elementin solunda olan elemneti seçer.
        -toRightOf ==> Belirtilen elementin sağında olan elemneti seçer.
        -near ==> Belirtilen elementin Yanında ya da yakınında olan elemneti seçer.
         */

        //amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //Relative Locator kullanarak Hybrid Bikes altındaki Road Bikes'a tıklayalım
        WebElement hybridBikes = driver.findElement(By.xpath("//span[text() = 'hybrid bike']"));

        WebElement roadBikes = driver.findElement(RelativeLocator.with(By.tagName("span")).below(hybridBikes));

        // sayfayı kapatın
        driver.close();
    }
}
