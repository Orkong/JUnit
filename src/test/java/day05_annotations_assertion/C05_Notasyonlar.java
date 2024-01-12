package day05_annotations_assertion;

import org.junit.*;

public class C05_Notasyonlar {

    @BeforeClass
    public static void  setupClass(){
        System.out.println("Before class calisti");}
    @AfterClass
    public static void  afterClass(){
        System.out.println("After class calisti");}
    @Before
    public void setup(){
        System.out.println("Before method calisti");}
    @After
    public void teardown(){
        System.out.println("After method calisti");}
    @Test
    public void test01(){
        System.out.println("Test01 calisti");}
    @Test
    public void test02(){
        System.out.println("Test02 calisti");}
    @Test
    public void test03(){
        System.out.println("Test03 calisti");}
}
