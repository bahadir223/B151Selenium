package techproed.day01_ilktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest_DriverMethods {

    public static void main(String[] args) {
        System.setProperty("chromedriver", "src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında System özelliklerini ayarlamak için setProperty methodu kullanırız.
        //setProperty methodu ile class'imiza driver'in fiziki yolunu belirtiriz.

        System.out.println(System.getProperty("chromedriver"));
        //getProperty ile "Key" degerini girerek "value"ya ulasabilirim.

        WebDriver myDriver = new ChromeDriver();
        //ChromeDriver türünde yeni bir obje oluşturduk.

        myDriver.get("https://techproeducation.com");   //get() methodu ile String olarak girilen url'e gideriz.

    }
}
