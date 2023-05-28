package selenium.OrnekSorular.KisaOrnekler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_GetMethods {

                    /*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.

                 */
                    public static void main(String[] args) {
                        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
                        WebDriver driver = new ChromeDriver();

                        //Amazon sayfasina gidelim. https://www.amazon.com/
                        driver.get("https://amazon.com");

                        //Sayfa basligini(title) yazdirin
                        System.out.println("Amazon sayfa başlığı = " + driver.getTitle());

                        //Sayfa basliginin “Amazon” icerdigini test edin
                        String actualTitle = driver.getTitle();
                        String expectedTitle = "Amazon";
                        if (actualTitle.contains(expectedTitle)){
                            System.out.println("Test PASSED");
                        }else {
                            System.out.println("Test FAILED --> " + actualTitle);
                        }

                        //Sayfa adresini(url) yazdirin
                        System.out.println("Amazon sayfasının URL'i = " + driver.getCurrentUrl());

                        //Sayfa url’inin “amazon” icerdigini test edin.
                        System.out.println("Amazon sayfa URL 'amazon' içeriyor mu? = " + driver.getCurrentUrl().contains("amazon"));

                        //Sayfa handle degerini yazdirin
                        System.out.println("Sayfa handle değeri = " + driver.getWindowHandle());

                        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
                        System.out.println("Sayfa HTML kodlari “Gateway” kelimesi içeriyor mu? = " + driver.getPageSource().contains("Gateway"));

                        driver.close();


                    }
}
