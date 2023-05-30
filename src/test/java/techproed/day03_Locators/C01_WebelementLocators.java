package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
        //Arama kutusuna iphone yazdıralım ve aratalım.
        myDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        /*
            1--> Bir webelementin locate'ini birden fazla kullanacaksanız bir Webelement'e değişken olarak atayabilirsiniz.
            Webelement aramaKutusu = myDriver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiliriz.
            2--> Locate işlemi bittikten sonra eğer webelemente metin göndereceksek sendKeys() methodu kullanırız.
            3--> Webelemente tıklayacaksak click() methodu kullanırız.
            4--> Webelementin üzerindeki yazıyı almak istiyorsak getText() kullanırız.
            5--> sendKeys() methodundan sonra(yani web elemente metin gönderdikten sonra) Keys.ENTER ile ya da
                 submit() methodu ile manuel olarak enter yaptığımız gibi otomasyonda da yapabiliriz.
         */

        //Sayfayı kapatalım.
        myDriver.close();
    }
}
