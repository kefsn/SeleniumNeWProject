package selenium.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // https://www.amazon.com sayfasına gidiniz
        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın
        // Linkleri konsolda yazdırın
        // sayfayı kapatın

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");

        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));

        // Linkleri  sayısı konsolda yazdırın
        System.out.println("Amazonda bulunan link sayısı: " +linklerListesi.size());

        //Linlkleri konsola yazdır
        for (WebElement w : linklerListesi){
            System.out.println(w.getText());
            //Kod olarak değilde String haliye bize yazdırması için getText() methodudunu kullandık .
        }




        // sayfayı kapatın

    }
}
