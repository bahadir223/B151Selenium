package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*
        cssSelector ile xpath arasındaki farklar;
        1- cssSelector de @ işareti ve // işaretleri kullanılmaz
        2- xpath ile index alabiliriz ama cssSelector ile index alamayız
        3- xpath ile text olarak locate edebiliriz ama cssSelector ile bunu yapamayız
        4- cssSelector xpath'e göre daha hızlı çalışır
        */

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(4000);

        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        Thread.sleep(3000);

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        boolean gorunurMu = deleteButton.isDisplayed();
        System.out.println("Delete Butonu Görünür mü? " + gorunurMu);

        //Delete tusuna basin
        deleteButton.click();
        Thread.sleep(3000);

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        boolean gorunurMu2 = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).isDisplayed();
        System.out.println("Add/Remove Elements yazisi gorunur mu? " + gorunurMu2);

        driver.close();

        /*ODEV!!!!!
        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        // Add Element butonuna 100 defa basınız
        // 100 defa basıldığını test ediniz
        // 90 defa delete butonuna basınız
        // 90 defa basıldığını doğrulayınız
        // Sayfayı kapatınız
         */

        /*
        2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin
        - Sayfayi “refresh” yapin
        Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        Gift Cards sekmesine basin
        Birthday butonuna basin
        Best Seller bolumunden ilk urunu tiklayin  9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        10-Sayfayi kapatin
         */


    }
}
