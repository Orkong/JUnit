package tests.day10_actionsClass_fileTestleri;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C03_FacebookKayitTesti extends TestBase {

    @Test
    public void kayitTesti(){

        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");

        //2- Cookies kabul edelim


        //3- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();

        //4- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        WebElement firstNameKutusu=driver.findElement(By.xpath("//input[@*='firstname']"));

        Actions actions=new Actions(driver);

        Faker faker=new Faker();
        String  fakeEmail=faker.internet().emailAddress();

        actions.click(firstNameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(fakeEmail)
                .sendKeys(Keys.TAB)
                .sendKeys(fakeEmail)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("Mar")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB)
                .perform();


        //5- Kaydol tusuna basalim

        ReusableMethods.bekle(3);
        driver.findElement(By.name("websubmit")).click();


    }
}
