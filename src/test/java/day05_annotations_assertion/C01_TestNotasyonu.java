package day05_annotations_assertion;

import org.junit.Ignore;
import org.junit.Test;

public class C01_TestNotasyonu {

    /*
        Test rotasyonu siradan bir methodu
        bagimsiz olarak calistirilabilen bir test methoduna donusturur

        bir class'da birden fazla test methodu varsa istersek her bir
        methodu tek basina, istersekte class level'dan calistirip
        toplu olarak calistirabiliriz.

        JUnit'te test methodlari toplu calistirildiginda
        hangi siralama ile calisacagini BILEMEYIZ ve KONTROL EDEMEYIZ.

        EGER calismasini istemediginiz bir test methodu varsa
        @Ignore rotasyonu kullanabiliriz
     */
    @Test
    public void testOtomasyonuTest(){
        System.out.println("testOtomasyonuTest calisti");
    }

    @Test @Ignore
    public void wiseQuarterTest(){
        System.out.println("Wise test calisti");
    }

    @Test
    public void youtubeTest(){
        System.out.println("youtube test calisti");
    }
}
