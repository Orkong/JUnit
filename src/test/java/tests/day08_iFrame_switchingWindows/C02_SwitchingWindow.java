package tests.day08_iFrame_switchingWindows;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C02_SwitchingWindow extends TestBase {

    @Test
    public void yeniWindowTesti(){

        /*
            Bir sayfada test yaparken
            driver.switchTo().newWindow(....) kullandigimizda
            yeni Window'u driver'a olusturttugumuz icin
            driver otomatik olarak yeni sayfaya gecer

            driver yeni window'a gectikten sonra
            eski window'lardan birine donmesi istenecekse
            donulecek window'da iken o sayfanin windowHandleDegerini alip kaydetmeliyiz

            driver.switchTo().window(kyadedilenWindowHandleDegeri) ile o sayfaya donebiliriz


         */

        //● testotomasyonu anasayfa adresine gidin.
        driver.get("https://www.testotomasyonu.com");

        //● Sayfa’nin window handle degerini String bir degiskene atayin
        String toWindowHandleDegeri= driver.getWindowHandle();

        //● Sayfa title’nin “Otomasyon” icerdigini test edin
        String expectedTitleIcerik="Otomasyon";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));

        //● Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://wisequarter.com");


        //● Sayfa title’nin “Wise Quarter” icerdigini test edin
        expectedTitleIcerik="Wise Quarter";
        actualTitle=driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));

        //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com");


        //● Sayfa title’nin “Walmart” icerdigini test edin
        expectedTitleIcerik="Walmart";
        actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));


        //● Ilk acilan sayfaya donun ve testotomasyonu sayfasina dondugunuzu test edin
        driver.switchTo().window(toWindowHandleDegeri);
        expectedTitleIcerik="Otomasyon";
        actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));



    }

}
