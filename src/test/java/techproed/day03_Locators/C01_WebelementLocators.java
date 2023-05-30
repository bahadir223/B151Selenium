package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver myDriver = new ChromeDriver();
        myDriver.manage().window().maximize();
        myDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        myDriver.get("https://www.amazon.com");

        //Arama kutusunu locate edelim.
        myDriver.findElement(By.id("twotabsearchtextbox"));
        /*
        Bir webelementin locate'ini birden fazla kullanacaksanız bir Webelement'e değişken olarak atayabilirsiniz.
        Webelement aramaKutusu = myDriver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiliriz.
         */

        //Arama kutusuna iphone yazdıralım ve aratalım.
        //Sayfayı kapatalım.
    }
}
