package selenium.day03_locators;

import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class NT3_FindElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        /*
        findelement ile bir webelemente ulaşabilirken, birden fazla webelement için findelements() methodunu kullanırız.
        Bu webelementlerin sayısına ulaşmak için ya da bu web elementlerin yazısını konsola yazdırabilmek için
        List<Webelement> linklerLlistesi=driver.findelements(By.locator("locator değeri")) olarak kullanırız.
        Oluşturmuş olduğumuz List'i loop ile konsola yazdırabiliriz
         */

        //Sayfadaki linklerin sayısını ve linkleri yazdıralım
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayısı = " + linklerListesi.size());

        //Lambda ile yazdıralim
       /* linklerListesi.stream().forEach(link-> {if (!link.getText().isEmpty()){
            System.out.println(link.getText());
        }});

        */



        for (WebElement w : linklerListesi){
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }

        }



    }
}
