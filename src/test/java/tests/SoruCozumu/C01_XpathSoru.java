package tests.SoruCozumu;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_XpathSoru extends TestBase{

   @Test
    public void xPathTesti(){


       //1- https://testotomasyonu.com/addremove/ adresine gidin
       driver.get("https://testotomasyonu.com/addremove/");


       //2- Add Element butonuna basin
       driver.findElement(By.id("sub-btn")).click();


       //3- Delete butonu’nun gorunur oldugunu test edin
       WebElement deleteButonuElementi= driver.findElement(By.xpath("//*[text()='Remove']"));

       //4- Delete tusuna basin
       driver.findElement(By.xpath("//*[text()='Remove']")).click();


       //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
       WebElement addRemoveElementi=driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));

   }



}
