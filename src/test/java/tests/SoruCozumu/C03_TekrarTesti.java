package tests.SoruCozumu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_TekrarTesti extends TestBase {

    @Test
    public void tekrarTesti(){

        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");

        //2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).click();

        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        //7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_link")).click();

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepetElementi= driver.findElement(By.className("cart_item"));
        String expectedSepet="Sauce Labs Backpack";
        String actualSepet=driver.getTitle();
        Assert.assertTrue(actualSepet.contains(expectedSepet));


        //9. Sayfayi kapatin



    }
}
