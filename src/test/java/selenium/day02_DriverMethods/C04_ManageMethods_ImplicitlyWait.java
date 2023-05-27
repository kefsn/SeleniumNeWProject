package selenium.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //sayfa başlatır başlatmaz maxmize yapıyoruz
        driver.manage().window().maximize();

        // bir sayfadaki tüm web elementlerin oluşmasını max süre dolana kadar bekler
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir

         Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler. 30 saniye beklemesini belirtirsem
         30 saniye bekler ve alt satıra geçer
         */

        //techproed sayfasina gidelim
        String techproUrl = "https://techproeducation.com";
        driver.get(techproUrl);

        //amazona gidelim
        String amazonUrl = "https://amazon.com";
        driver.get(amazonUrl);

        //techpro sayfasina geri donelim
        driver.navigate().back();

        //sayfa basligini Techpro icerdigini test edelim
        String actualBaslik = driver.getTitle();
        String expextedBaslik = "Techpro";
        if (actualBaslik.contains(expextedBaslik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("TEST FAILED -> "  +actualBaslik);
        }

        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();

        //sayfa basligini Amazon icerdigini test edelim

        //1.Way
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //2.Way
        String actualTitle = driver.getTitle();
        String expextedTitle = "Amazon";
        if (actualTitle.contains(expextedTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //sayfayı kapatınız
        driver.close();

        /*
        Yeni bir Class olusturalim.C07_ManageWindowSet
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
8. Sayfayi kapatin
         */
    }
}
