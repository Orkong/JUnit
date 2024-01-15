package utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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
}
