package tests.SoruCozumu;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C02_SearchTest extends TestBase {

    @Test
    public void ClassWork(){

        //1- testotomasyonu.com anasayfasina gidelim
        driver.get("https://www.testotomasyonu.com");


        //2- arama kutusunu locate edelim
        WebElement aramaKutusu= driver.findElement(By.id("global-search"));


        //3- “phone” ile arama yapalim
        driver.findElement(By.id("global-search")).sendKeys("phone"+ Keys.ENTER);


        //4- Bulunan sonuc sayisini yazdiralim
        WebElement urunSayisiElementi= driver.findElement(By.className("product-count-text"));
        String expectedUrunSayisi =urunSayisiElementi.getText();
        System.out.println(expectedUrunSayisi);


        //5- Ilk urunu tiklayalim
        driver.findElement(By.className("prod-img")).click();

        ReusableMethods.bekle(2);



        //6- Urunun stokta var oldugunu test edin







    }


}
