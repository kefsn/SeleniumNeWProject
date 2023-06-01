package selenium.OrnekSorular.KisaOrnekler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_isEnabled {

    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Çıkan reklamı locate edip kapatalım
        WebElement reklam = driver.findElement(By.xpath("//i[@class ='eicon-close']"));
        reklam.click();

        //Arama bölümünde qa aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id = 'elementor-search-form-9f26725']"));
        aramaKutusu.sendKeys("qa" + Keys.ENTER);

        //Sayfa başlığının qa içerdiğini doğrulayalım
        boolean iceriyorMu = driver.getTitle().contains("qa");

        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        WebElement carrerQAlink = driver.findElement(By.xpath("//a[text() = 'Career Opportunities In QA']"));
        System.out.println("Erişilebilir mi? = " + carrerQAlink.isEnabled());

        //Carrer Opportunities In QA linkine tıklayalım
        carrerQAlink.click();

        //Başlığın Opportunities içerdiğini test edelim
        driver.getTitle().contains("Opportunities");

        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
        driver.navigate().back();
        System.out.println("Techpro URL = " + driver.getCurrentUrl());


    }
}
