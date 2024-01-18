package tests.day10_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C02_TestOtomasyonuRegister extends TestBase {

    @Test
    public void kayitOlusturmaTesti() throws InterruptedException {

        // 1- https://www.testotomasyonu.com adresine gidelim
        driver.get("https://www.testotomasyonu.com");

        //2- Account linkine tiklayin
        driver.findElement(By.xpath("(//a[@class='e-cart'])[1]"))
                .click();

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, 500);");




        ReusableMethods.bekle(3);

        //3- Sign Up linkine basalim
        driver.findElement(By.xpath("//a[text()=' Sign Up']"))
                .click();



        //4- Ad, soyad, mail ve sifre kutularina deger yazalim
        WebElement firstNameKutusu=driver.findElement(By.id("firstName"));

        Actions actions=new Actions(driver);
        ReusableMethods.bekle(2);
        actions.click(firstNameKutusu)
                .sendKeys("Orkong")
                .sendKeys(Keys.TAB)
                .sendKeys("Esatoglu")
                .sendKeys(Keys.TAB)
                .sendKeys("Orkong@hotmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .perform();


        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(2);


        // Sign Up butonuna basalim
        driver.findElement(By.id("btn-submit-form")).click();


        //5- Kaydin olusturuldugunu test edin
        WebElement emailKutusu= driver.findElement(By.xpath("//input[@id='email']"));

        emailKutusu.sendKeys("Orkong@hotmail.com");

        WebElement passwordKutusu= driver.findElement(By.xpath("//input[@id='password']"));

        passwordKutusu.sendKeys("12345");

        WebElement singInButonu= driver.findElement(By.xpath("//*[@id='submitlogin']"));

        singInButonu.click();

        WebElement uyeEmailElementi= driver.findElement(By.xpath("//p[text()='Orkong@hotmail.com']"));

        Assert.assertTrue(uyeEmailElementi.isDisplayed());

        ReusableMethods.bekle(1);



    }
}
