package selenium.OrnekSorular.KisaOrnekler;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageWindowSet {


    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


         /*
        Yeni bir Class olusturalim.C07_ManageWindowSet
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        8. Sayfayi kapatin
         */


        // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Her browser'ı muhakkak maximize edelim, web elementlerin tamamını görebilmek için.
        driver.manage().window().maximize();

        //Safya açılana kadar maksimum 20 saniye bekler. Sayfa 20 saniyeden önce açılırsa, 20 saniyenin bitmesini beklemez.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu = " + driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setSize(new Dimension(400,500));
        driver.manage().window().setPosition(new Point(40,40));

        driver.close();

    }
}
