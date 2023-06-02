package selenium.OrnekSorular.KisaOrnekler2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_Facebook {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*

        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        yazdirin.
         */

        //facebook sayfasina gidin
        driver.get("https://facebook.com");

        //sayfa basliginin (title) "facebook" oldugunu dogrulayin (verify)
        //degilse dogru basligi yazdirin.
           String sayfaBasligi = driver.getTitle();
           if (sayfaBasligi.equals("facebook")){
               System.out.println("Sayfa başlığı facebook");
           }else{
               System.out.println("Gerçek sayfa başlığı --> " + sayfaBasligi);
           }

           // Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin,
       // icermiyorsa "actual" URL'i   yazdirin.

        String faceUrl = driver.getCurrentUrl();
           if (faceUrl.contains("facebook")){
               System.out.println("Facebook kelimesi içeriyor");
           }else {
               System.out.println("İçermiyor! Gerçek Url --> " +faceUrl);
           }


    }
}
