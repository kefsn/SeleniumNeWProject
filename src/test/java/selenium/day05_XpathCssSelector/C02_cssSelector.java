package selenium.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        WebElement addButonu = driver.findElement(By.cssSelector("button[onclick = 'addElement()'] "));
        addButonu.click();

        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.cssSelector("button[class = 'added-manually']"));
        System.out.println("Delete butonu görünür mü? = " + deleteButonu.isDisplayed());

        //Delete butonuna basin
        deleteButonu.click();

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveElemen = driver.findElement(By.cssSelector("h3"));
        if (addRemoveElemen.isDisplayed()) {
            System.out.println("Add/Remove Element yazısı görünür");
        } else {
            System.out.println("Add/Remove Element yazısı görünür değil");
        }


        //Sayfayı kapatın
        driver.close();

            /*
             xPath ve cssSelector arasindaki farklar
                -Xpath text ile calisir.
                -cssSelector text ile calismaz.
                -Xpath index'e gore arama yapabilir. Daha fazla kombinasyona sahiptir.
                -cssSelector index'e gore arama yapamaz.Ama daha hızlı çalışır.

             */

    }
}
