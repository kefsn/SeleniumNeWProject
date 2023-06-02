package selenium.OrnekSorular.KisaOrnekler2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class YüzDefaBas {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        /*
        http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        Add Element butonuna 100 defa basınız
        100 defa basıldığını test ediniz
        90 defa delete butonuna basınız
        90 defa basıldığını doğrulayınız
        Sayfayı kapatınız
         */

        //  http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna 100 defa basınız
        for (int i = 0; i < 100; i++) {

            WebElement addButonu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
            addButonu.click();

        }

        //90 defa delete butonuna basınız

        for (int i = 0; i < 91; i++) {
            WebElement deleteButonu = driver.findElement(By.xpath("(//*[@class='added-manually'])[1]"));
            deleteButonu.click();

        }


    }
}
