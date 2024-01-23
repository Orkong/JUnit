package tests.day13_excelOtomasyon;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void readExcelTest() throws IOException {

        //7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu= "src/test/java/tests/day13_excelOtomasyon/ulkeler.xlsx";


        //8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);

        //9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        //10. WorkbookFactory.create(fileInputStream)
        // dosya yolu sayesinde dosyaya ulasip
        // fileInputStream ile dosyadaki bilgileri adlik
        // ve o bilgileri bu class'da kullanabilmek icin
        // kendi olsuturdugumuz workbook objesine yukledik


        //11. Worksheet objesi olusturun workbook.getSheetAt(index)
        Sheet sayfa1=workbook.getSheet("Sayfa1");

        // Row ve Cell index kullanir, yani 0'dan baslar


        //12. Row objesi olusturun sheet.getRow(index)
        Row row=sayfa1.getRow(7);


        //13. Cell objesi olusturun row.getCell(index)
        Cell cell=row.getCell(1);

        System.out.println(cell);


    }
}
