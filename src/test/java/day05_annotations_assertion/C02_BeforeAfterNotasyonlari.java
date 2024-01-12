package day05_annotations_assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BeforeAfterNotasyonlari {

    // uc farkli test methodunda verilen sayfalara gidin
    // o sayfaya gidildigini test edin ve sayfayi kapatin

    WebDriver driver ;

    public void baslangicAyarlariYap (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void testOtomasyonuTest(){
        System.out.println("testOtomasyonuTest calisti");
        baslangicAyarlariYap();
        driver.get("https://www.testotomasyonu.com/");

        String expectedUrl= "https://www.testotomasyonu.com/";
        String actualUrl =driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }

    @Test
    public void wiseQuarterTest(){
        baslangicAyarlariYap();
        driver.get("https://www.wisequarter.com/");

        String expectedUrl= "https://wisequarter.com/";
        String actualUrl =driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Wise Test PASSED");
        }else {
            System.out.println("Wise Test Failed");
        }
        driver.quit();
    }

    @Test
    public void youtubeTest(){
        baslangicAyarlariYap();
        driver.get("https://www.youtube.com/");

        String expectedUrl= "https://www.youtube.com/";
        String actualUrl =driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Youtube Test PASSED");
        }else {
            System.out.println("Youtube Test Failed");
        }
        driver.quit();
    }

}
