package day05_annotations_assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeAfterNotasyonlari {

    // uc farkli test methodunda verilen sayfalara gidin
    // o sayfaya gidildigini test edin ve sayfayi kapatin

    /*
        Eger bir calss'da her test method'undan once calismasini istediginiz kodlar var ise
        bunu saglamak icin @Before notasyonuna sahip bir method olusturabiliriz

        Eger bir class'da her test methodu calistiktan sonra calismasini istediginiz kodlar var ise
        bunu saglamak icin @After notasyonuna sahip bir method olusturabiliriz




     */
    WebDriver driver ;
    @Before
    public void setup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @After
    public void teardown(){
        driver.quit();
    }
    @Test
    public void testOtomasyonuTest(){

        driver.get("https://www.testotomasyonu.com/");

        String expectedUrl= "https://www.testotomasyonu.com/";
        String actualUrl =driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test Failed");
        }
    }
    @Test
    public void wiseQuarterTest(){
        driver.get("https://www.wisequarter.com/");

        String expectedUrl= "https://wisequarter.com/";
        String actualUrl =driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Wise Test PASSED");
        }else {
            System.out.println("Wise Test Failed");
        }
    }
    @Test
    public void youtubeTest(){
        driver.get("https://www.youtube.com/");

        String expectedUrl= "https://www.youtube.com/";
        String actualUrl =driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Youtube Test PASSED");
        }else {
            System.out.println("Youtube Test Failed");
        }
    }

}
