package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike"  yazıp aratın
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("city bike", Keys.ENTER);
        Thread.sleep(3000);
        // Hybrid Bikes bölümüne tıklayın
        driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click();

        // sonuc sayısını yazdırın
        WebElement sonuc = driver.findElement(By.xpath("//*[text()='14 results for']"));
        System.out.println("Sonucumuz =" + sonuc.getText());    //14 results for
        String[] arr = sonuc.getText().split(" ");
        System.out.println("Sonuc Sayisi = " + arr[0]);

        // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//*[@class='s-image'])[1]")).click();

        // Sayfayı kapatınız
        driver.close();
    }
}
