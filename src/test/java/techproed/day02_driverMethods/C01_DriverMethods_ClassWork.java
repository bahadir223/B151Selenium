package techproed.day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {

    public static void main(String[] args) {
        System.setProperty("chromedriver", "src/resources/drivers/chromedriver.exe");
        WebDriver myDriver = new ChromeDriver();

        //Amazon sayfasina gidelim.
        myDriver.get("https://www.amazon.com");

        //Sayfa basliginin Amazon icerdigini test edelim.
        String actualTitle = myDriver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        //Url'in https://www.amazon.com oldugunu test edelim.
        String actualURL = myDriver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/";
        if (actualURL.equals(expectedURL)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        //Sayfayi kapatalim.
        //myDriver.close();   //Browser'i kapatir.
        //myDriver.quit();//Birden fazla browser varsa hepsini kapatir.
        /*ODEV
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
                Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.*/


    }
}
