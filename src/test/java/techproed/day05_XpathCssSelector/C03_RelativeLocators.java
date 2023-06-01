package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelativeLocators {

    public static void main(String[] args) throws InterruptedException {
        /*
        Benzer özelliklere sahip web elementler icin relative locator kullanabiliriz
        SYNTAX;
        driver.findElement(with(By.tagname).below().above().to_left_of().to_right_of().near()) gibi methodlar
        ile benzer özelliklere sahip web elementleri locate'ini almadan o web elemente ulaşabiliriz.
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //amazona gidelim
        driver.get("https://www.amazon.com");

        //city bike aratalım
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("city bike", Keys.ENTER);
        Thread.sleep(3000);

        //relative locator kullanarak hybrid bikes'in 2 altindaki elemente tıklayalım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        WebElement cruiserBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        cruiserBike.click();
        Thread.sleep(3000);

        driver.close();


    }
}
