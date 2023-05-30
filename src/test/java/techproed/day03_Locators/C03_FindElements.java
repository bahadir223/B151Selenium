package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver myDriver = new ChromeDriver();
        myDriver.manage().window().maximize();
        myDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim.
        myDriver.get("https://www.amazon.com");

        //Sayfadaki linklerin sayısını ve linkleri yazdıralım.
        /*
        findElement() ile 1 webelemente ulaşabilirken, 1'den fazla webelement için findElements() methodunu kullanırız.
        Bu web elementlerin sayısına ulaşmak için ya da bu webelementlerin yazısını konsola yazdırabilmek için
        List<Webelement> linklerListesi = myDriver.findElements(By.locator("locator degeri)) olarak kullanırız.
        Oluşturmuş olduğumuz list'i loop ile console' a yazdirabiliriz.
         */
        List<WebElement> linklerListesi = myDriver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayısı = " + linklerListesi.size());
/*
        for (WebElement w : linklerListesi) {
            if (!w.getText().isEmpty()) {
                System.out.println(w.getText());
                //webelementin üzerindeki yazıyı almak istiyorsan getText() methodu kullanırız.
            }
        }*/
        //lambda ile yazdıralım:
        linklerListesi.forEach(w -> {
                    if (!w.getText().isEmpty()) {
                        System.out.println(w.getText());
                    }
                }
        );
        //Shop deals in Electronics webElementinin yazısını yazdıralım.
        System.out.println("******************************************************");
        //mesela benim almak istediğim webelemtin id attribute'i yok, bu yüzden linktextini aldım(başka bir attribuet da alabilirdim..
        System.out.println(myDriver.findElement(By.linkText("Shop great deals now")).getText());
        System.out.println("////////////////////////////////////////////////////////");
        System.out.println(myDriver.findElement(By.id("swm-link")).getText());

        myDriver.close();

        //Amazon sayfasına gidiniz
        //iphone aratınız
        //çıkan sonuç yazısını konsola yazdırınız
        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız...


    }
}
