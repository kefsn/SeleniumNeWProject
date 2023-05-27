package selenium.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında system özelliiklerini ayarlamak için setProperty() methodu ile kullanırız.
        //setProperty methodu ile class'ımıza driver 'ın fiziki yolunu belirtiriz.
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" değerini girerek "value" a ulaşılabilir.

        //System.setProperty(" webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://www.techproeducation.com");
        WebDriver driver = new ChromeDriver();
        //ChromeDriver türünde yeni bir obje oluşturduk.

        driver.get("https://techproeducation.com");//get() meyhodu ile String olarak girilen url'ye gider.

    }
}
