package techproed.day01_ilktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Amazon Basligi = " + driver.getTitle());
        System.out.println("Amazon Actual Url : " + driver.getCurrentUrl());
        String amazonWindowHandle=driver.getWindowHandle();
        System.out.println("Amazon Window Handle Degeri : "+amazonWindowHandle);


        driver.get("https://techproeducation.com");
        System.out.println("Techpro Sayfa Basligi : " + driver.getTitle());//en son gidilen sayfanın başlığını vericek.(biz bunu console'da görebileceğiz.

        //getCurrentUrl() en son gidilen sayfanın url'ini verir.
        System.out.println("Techproed Actual Url : " + driver.getCurrentUrl());


        //getPageSource() açılan sayfanın kaynak kodlarını verir.
        //System.out.println(driver.getPageSource()); Bilerek yoruma aldık...Her çalıştırdığımızda çıkmasın diye.

        //getWindowHandle() gidilen sayfanin handle değerini(hashkod) verir.Bu handle degerini sayfalar arası geçiş icin kullaniriz.
        System.out.println("Techpro Window Handle Degeri : "+driver.getWindowHandle());
    }
}
