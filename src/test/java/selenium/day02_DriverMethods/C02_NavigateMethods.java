package selenium.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        Techproeducation sayfasın gidelim
        Sonra Amazon sayfasına  gidelim
        Amazon sayfasının başlığını yazdıralım
        Tecproeducation sayfasına geri dönelim
        Sayfa başlığını yazdıralım
        Amazon sayfasıan tekrar gidip URL'i yazdıralım
        Amazon sayfasındayken sayfayı yenileyelim.
         */
        //Techproeducation sayfasın gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile aynı mantık da çalışır.
        Thread.sleep(3000);//Java kodlarını bekletmek için Thread.sleep kullanabiliriz.

        //Sonra Amazon sayfasına  gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon Sayfa Başlığı = " + driver.getTitle());
        Thread.sleep(3000);

        //Tecproeducation sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfa başlığını yazdıralım
        System.out.println("techproeducation Sayfa Başlığı = " + driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasıan tekrar gidip URL'i yazdıralım
        driver.navigate().forward();
        System.out.println("Amazon Sayfası URL = " + driver.getCurrentUrl());
        Thread.sleep(3000);

        // Amazon sayfasındayken sayfayı yenileyelim.
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfayı kapatalım
        driver.close();

        //Browser'a gittikten sonra ilk is olarak sayfayi her zaman maximize yapmaliyiz

        /*
            Yeni bir Class olusturalim.C05_NavigationMethods
    Youtube ana sayfasina gidelim . https://www.youtube.com/
    Amazon soyfasina gidelim. https://www.amazon.com/
    Tekrar YouTube’sayfasina donelim
    Yeniden Amazon sayfasina gidelim
    Sayfayi Refresh(yenile) yapalim
    Sayfayi kapatalim / Tum sayfalari kapatalim
    Collapse
         */

    }
}
