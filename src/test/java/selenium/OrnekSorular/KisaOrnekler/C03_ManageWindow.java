package selenium.OrnekSorular.KisaOrnekler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


         /*
                1.Yeni bir Class olusturalim.C06_ManageWindow
        2.Amazon soyfasina gidelim. https://www.amazon.com/
        3.Sayfanin konumunu ve boyutlarini yazdirin
        4.Sayfayi simge durumuna getirin
        5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        7.Sayfayi fullscreen yapin
        8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        9.Sayfayi kapatin
         */

        //2.Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //3.Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu = " + driver.manage().window().getSize());

        //4.Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        driver.manage().window().maximize();

        //6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanın konumu maximize durumda = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu maximize durumda = " + driver.manage().window().getSize());

        //7.Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanın konumu fullscreen durumda = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu fullscreen durumda = " + driver.manage().window().getSize());

        //9.Sayfayi kapatin
        driver.close();



    }
}
