package selenium.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NT02_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Arama kutusunu locate edip iphone aratalım
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("Iphone");
        Thread.sleep(3000);
        aramaKutusu.submit();

        //Sayfayı kapatalım
        driver.close();


    }
}
