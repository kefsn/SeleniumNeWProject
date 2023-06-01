package selenium.day04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_WebElementLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        // sonuc yazısını yazdırın
        List<WebElement> sonucYazilari = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisi = sonucYazilari.get(0);

        System.out.println("Sonuc Yazısı = " + sonucYazisi.getText());

        // sonuc sayısını yazdırın
       String sonucSayisi[] = sonucYazisi.getText().split(" ");
        System.out.println(Arrays.toString(sonucSayisi));
        System.out.println(sonucSayisi[2]);

        // ilk ürünün locatini alın
        List<WebElement> sonuclar = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = sonuclar.get(0);//Bu şekilde ilk elemanı almış olduk.

        //Sayfadaki 12. elementi list kullanmadan xpath'in index özelliğini kullanarak locate aldık
        WebElement onikinciElement = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[12]"));
        System.out.println(onikinciElement.getText());



        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println("İlk ürün görünüyor mu? = " + ilkUrun.isDisplayed());

        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println("İlk ürüne erişilebiliyor mu? = " + ilkUrun.isEnabled());

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println("İlk ürün seçilebiliyor mu? = " + ilkUrun.isSelected());

        // ilk urune tıklayın
        ilkUrun.click();


        //Relative Xpath syntax -->  //tagname[@attributeName='atributeValue']
        //input[@type='text']
        //                            (//input[@type='text'])[1]
        //                            //*[@type='text']
    /*
        Aldığımız xpath unique olmadığı zaman xpath'imizi parantez içine alarak index belirtebiliriz.
    Böylelikle webelementleri Liste atıp istediğimiz elementi almakla uğraşmayız.
    Xpath'in değişik kullanma yolları vardır.
     */


        // sayfayı kapatın
        driver.close();



    }
}
