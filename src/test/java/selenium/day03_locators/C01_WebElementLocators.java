package selenium.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {
    public static void main(String[] args) {

        // https://www.amazon.com sayfasına gidiniz
// aramakutusunu locate ediniz ve Nutella aratınız
// sayfayı kapatınız

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");

        // aramakutusunu locate ediniz ve Nutella aratınız
       WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //İstediğimiz öğreyi aratmak için sendKeys() kullan.
        //Enter'a basmak için de Keys.ENTER  kullan.

        /*
        Eger bir webelement'i birden fazla kullanmayacaksanız bir webelement'e esayn etmeyebilirsiniz.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);
         */

        driver.close();

    }
}
