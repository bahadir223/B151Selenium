package techproed.day06_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //amazona gidelim
        driver.get("https://www.amazon.com");

        //city bike aratalım
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("city bike", Keys.ENTER);
        Thread.sleep(3000);

        //relative locator kullanarak hybrid bikes'in altindaki elemente tıklayalım
        //Webelementlerin yazısını konsola yazdıralım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.getText());
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement cruiserBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(cruiserBike.getText());
        System.out.println("***********************");
        //Bikes altındaki tüm linkleri(webelementleri) konsola yazdıralım.
        List<WebElement> linkler = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
         /*
            XPATH kullaniminda bir sayfadaki webelementlere mudehala etmek istedigimizda xpath ile locate aldigimizda birden fazla sonuc
        verebilir. [position()>=9 and position()<=15] bu kullanimla aralik belirterek istedigimiz webelementleri secip mudehale edebiliriz.
         */


        //for ile
        for (int i = 0; i < linkler.size(); i++) {
            System.out.println(linkler.get(i).getText());
        }
        //lambda ile
        linkler.forEach(t -> System.out.println(t.getText()));

        //foreach ile
        for (WebElement w : linkler) {
            System.out.println(w.getText());
        }

        //Bu linklerin hepsini tıklayalım ve sayfa başlıklarını alalım
        for (int i = 0; i < linkler.size(); i++) {
            linkler = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
            //StaleElementReferenceException: almamak için tekrar tanımladık. Diğer türlü bayat locate diyor.hata veriyor.
            System.out.println(linkler.get(i).getText());
            linkler.get(i).click();
            Thread.sleep(3000);

            driver.navigate().back();

            Thread.sleep(3000);

        }
    }
}
