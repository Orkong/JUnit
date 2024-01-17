package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReusableMethods {

    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String>stringListeCevir(List<WebElement>webelementList){

        List<String> stringlist =new ArrayList<>();

        for (WebElement eachElemenet: webelementList
             ) {

            stringlist.add(eachElemenet.getText());
        }
        return  stringlist;
    }


    public static void titleIleWindowDegistir(String hedefTitle, WebDriver driver){

        Set<String> whdSeti = driver.getWindowHandles();
        System.out.println(whdSeti);

        for (String eachWhd : whdSeti
        ) {
            driver.switchTo().window(eachWhd);

            String oldugumuzSayfaTitle = driver.getTitle();

            if (oldugumuzSayfaTitle.equals(hedefTitle)){
                System.out.println(oldugumuzSayfaTitle);
                break;
            }
        }

    }
}
