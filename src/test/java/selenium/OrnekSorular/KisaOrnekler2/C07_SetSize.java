package selenium.OrnekSorular.KisaOrnekler2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_SetSize {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        ManageWindowSet
            Amazon soyfasina gidelim. https://www.amazon.com/
            Sayfanin konumunu ve boyutlarini yazdirin
            Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
            Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
            Sayfayi kapatin

         */

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //  Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu = " + driver.manage().window().getSize());
        Thread.sleep(2000);

        // Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
         driver.manage().window().setPosition(new Point(30, 40));
        driver.manage().window().setSize(new Dimension(516, 600));

        // Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanın Yeni Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Yeni Boyutu = " + driver.manage().window().getSize());

        //Sayfayı Kapatın
        driver.close();


    }
}

