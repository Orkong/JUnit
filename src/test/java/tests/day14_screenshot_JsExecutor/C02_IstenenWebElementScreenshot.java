package tests.day14_screenshot_JsExecutor;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_IstenenWebElementScreenshot extends TestBase {

    @Test
    public void aramaTesti() throws IOException {

        // testotomasyon anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazip, arama kutusunun screenshot'ini alin
        WebElement aramaKutusu= driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("Phone");

            // 1- Screenshot alacaginiz webelementi locate edip kaydedin
            // 2- screenshot'i kaydedecegimi dosyayi olusturun
        File webElementSS= new File("target/webElementScreenshots/aramaKutusu.jpg");
            // 3- webElementi kullanarak screenshot alin ve gecici dosyaya kaydedin
        File geciciScreenshot= aramaKutusu.getScreenshotAs(OutputType.FILE);
            // 4- gecici dosyayi asil doyaya kopyalayalim
        FileUtils.copyFile(geciciScreenshot,webElementSS);

        // phone icin arama yapin
        aramaKutusu.submit();

        // arama sonucunda urun bulunabildigini test edin
        WebElement aramaSonucElementi= driver.findElement(By.xpath("//*[@*='product-count-text']"));
        String unExpectedSonucYazisi= "0 Products Found";
        String actualSonucYazisi=aramaSonucElementi.getText();
        Assert.assertNotEquals(unExpectedSonucYazisi,actualSonucYazisi);

        // arama sonuc yazisinin screenshot'ini alin


        ReusableMethods.bekle(3);

    }
}
