package tests.day07_jsAlerts_iFrame;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C04_iFrame extends TestBase {

    @Test
    public void iFrameTesti(){

        //1- https://testotomasyonu.com/discount adresine gidin
        driver.get("https://testotomasyonu.com/discount");

        //2- Elektronics Products yazisinin gorunur olduğunu test edin
        // kullanacagimiz elementin locate'inden %100 emin olmamiza ragmen
        // NoSuchElementException verdi
        // Kontrol ettigimizde kullanacagimiz elementin bir iframe icerisinde oldugunu gorudk
            // 1. adim : gecis yapacagimiz iframe'i locate etmek
            WebElement electronicsIframe= driver.findElement(By.xpath("(//iframe[@frameborder='1'])[1]"));
            // 2. adim: locate etttigimiz iframe gecis yapalim
            driver.switchTo().frame(electronicsIframe);
            // 3 .adim: iframe icindeki elementleri kullan


        WebElement elektronicsProdutsElementi = driver.findElement(By.xpath("//h2[text()='Electronics Products']"));
        Assert.assertTrue(elektronicsProdutsElementi.isDisplayed());

        //3- Dell bilgisayar urun isminin ‘DELL Core I3 11th Gen’ olduğunu test edin
        WebElement dellIsimElementi =driver.findElement(By.xpath("//*[text()='DELL Core I3 11th Gen ']"));
        String expectedIsim="DELL Core I3 11th Gen";
        String actualIsim =dellIsimElementi.getText();

        Assert.assertEquals(expectedIsim,actualIsim);

        //4- Sagdaki bolumde gorunen urunler arasinda ‘Men Slim Fit’ içeren en az 1 urun olduğunu test edin
        WebElement menSlimFit= driver.findElement(By.xpath("(//iframe[@frameborder='1'])[2]"));
        driver.switchTo().frame(menSlimFit);

        WebElement menSlimFitElementi =driver.findElement(By.xpath("//*[text()='Men Slim Fit Casual Shirt']"));

        //5- Fashion yazisinin gorunur olduğunu test edin


        //6- Sayfayi kapatin


        ReusableMethods.bekle(3);
    }
}
