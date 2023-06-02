package selenium.OrnekSorular.KisaOrnekler2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_Refresh {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        /*
                2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin
        - Sayfayi “refresh” yapin
        Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        Gift Cards sekmesine basin
        Birthday butonuna basin
        Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        10-Sayfayi kapatin
         */

        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        System.out.println("Sayfa başlığı 'Spend less' içeriyor mu? = " + driver.getTitle().contains("Spend less"));

        //Gift Cards sekmesine basin  //a[text()='Gift Cards']   //By.linkText("Gift Cards")
        WebElement text = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
        text.click();

        // Birthday butonuna basin
         driver.findElement(By.xpath("//*[@alt='Birthday']")).click();

         //Bestseller ilk ürünü tıklayın
         driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]")).click();

         //9- Gift card details’den 25 $’i secin
       WebElement dolar =  driver.findElement(By.id("gc-mini-picker-amount-1"));
       dolar.click();

       //sayfayı kapatalım
        driver.close();




    }

}
