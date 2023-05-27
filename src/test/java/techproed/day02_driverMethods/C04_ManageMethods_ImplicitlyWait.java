package techproed.day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromedriver", "src/resources/drivers/chromedriver.exe");
        WebDriver myDriver = new ChromeDriver();
        myDriver.manage().window().maximize();//browser'i açar açmaz bu 2 işi yapmayı gelenek haline getir!!!
        myDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         /*
        implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir.
        Thread.sleep() java kodlarini bizim belirttigimiz süre kadar bekler.30 saniye beklemesini belirtirsem
        30 saniye bekler ve alt satira gecer.
         */
        String techproURL = "https://www.techproeducation.com";
        String amazonURL = "https://www.amazon.com";

        //techproed sayfasina gidelim.
        myDriver.get(techproURL);
        Thread.sleep(3000);

        //amazona gidelim.
        myDriver.get(amazonURL);
        Thread.sleep(3000);

        //techproed sayfasina geri dönelim.
        myDriver.navigate().back();
        Thread.sleep(3000);

        //sayfa basliginin techpro içerdigini test edelim.
        String actualTitle = myDriver.getTitle();
        String arananKelime = "techpro";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED --> " + actualTitle);
        }

        //tekrar amazon sayfasina gidelim.
        myDriver.navigate().forward();

        //sayfa basliginin Amazon içerdiğini test edelim.
        String baslik = myDriver.getTitle();
        String arananKelime2 = "Amazon";
        if (baslik.contains(arananKelime2)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
        myDriver.close();
    }

}

