package tests.day07_jsAlerts_iFrame;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_JsAlerts extends TestBase {



    @Test
    public void birinciAlertTesti(){

        //1. Test
        // - https://testotomasyonu.com/javascriptAlert adresine gidin
        driver.get("https://testotomasyonu.com/javascriptAlert");

        // - 1.alert’e tiklayin
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();

        // - Alert’deki yazinin “I am a JS Alert” oldugunu test edin
        String actualAlertYazi= driver.switchTo().alert().getText();
        String expectedAlertYazi="I am a JS Alert";
        Assert.assertEquals(expectedAlertYazi,actualAlertYazi);


        // - OK tusuna basip alert’i kapatin
        driver.switchTo().alert().accept();

    }

    @Test
    public void ikinciAlertTesti(){

        //2.Test
        // - https://testotomasyonu.com/javascriptAlert adresine gidin
        driver.get("https://testotomasyonu.com/javascriptAlert");

        // - 2.alert’e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();

        // - Cancel’a basip,
        driver.switchTo().alert().dismiss();

        // cikan sonuc yazisinin “You clicked: Cancel” oldugunu test edin
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//*[@id='result']"));

        String expectedSonucYazsi="You clicked: Cancel";
        String actualSonucYazisi=sonucYaziElementi.getText();

        Assert.assertEquals(expectedSonucYazsi,actualSonucYazisi);
    }



    @Test
    public void ucuncuAlertTest(){

        //3.Test
        // - https://testotomasyonu.com/javascriptAlert adresine gidin
        driver.get("https://testotomasyonu.com/javascriptAlert");

        // - 3.alert’e tiklayalim
        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();

        // - Cikan prompt ekranina “Abdullah” yazdiralim
        driver.switchTo().alert().sendKeys("Orkong");

        // - OK tusuna basarak alert’i kapatalim
        driver.switchTo().alert().accept();

        // - Cikan sonuc yazisinin Orkong icerdigini test edelim
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//*[@id='result']"));
        String expectedYaziIcerik="Orkong";
        String actualYaziIcerik=sonucYaziElementi.getText();

        Assert.assertTrue(actualYaziIcerik.contains(expectedYaziIcerik));

    }


}
