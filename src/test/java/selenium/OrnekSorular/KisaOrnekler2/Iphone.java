package selenium.OrnekSorular.KisaOrnekler2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Iphone {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        ödev : 7
        Amazon sayfasına gidiniz
        iphone aratınız
        çıkan sonuç yazısını konsola yazdırınız
        çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
         */

        // Amazon sayfasına gidiniz
        driver.get("https://amazon.com");//24349024794/108

        //iphone aratınız
         WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
         aramaKutusu.sendKeys("iphone" + Keys.ENTER);

         //çıkan sonuç yazısını konsola yazdırınız
         WebElement webElementList = driver.findElement(By.xpath("//*[text()='1-16 of 27 results for']"));
        System.out.println("Sonuç Yazısı = " + webElementList.getText());


    }
}
