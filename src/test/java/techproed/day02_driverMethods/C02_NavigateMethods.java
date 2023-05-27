package techproed.day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "src/resources/drivers/chromedriver.exe");
        WebDriver myDriver = new ChromeDriver();

        //Techproeducation sayfasina gidelim.
        myDriver.navigate().to("https://www.techproeducation.com"); //get() methodu ile ayni mantikta calisir.
        Thread.sleep(3000);//Java kodlarini bekletmek icin kullanıyoruz.

        //Sonra Amazon sayfasina gidelim.
        myDriver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);


        //Amazon sayfasinin basligini yazdiralim.
        System.out.println("Amazon Sayfa Basligi = " + myDriver.getTitle());

        //Techproeducation sayfasina geri donelim.
        myDriver.navigate().back();
        Thread.sleep(3000);


        //Sayfa basligini yazdiralim.
        System.out.println("Techpro Sayfa Basligi = " + myDriver.getTitle());

        //Amazon sayfasina tekrar gidip url'i yazdiralim.
        myDriver.navigate().forward();
        System.out.println("Amazon URL = " + myDriver.getCurrentUrl());

        //Amazon sayfasindayken sayfayi yenileyelim.
        myDriver.navigate().refresh();
        Thread.sleep(3000);

        myDriver.close();
        /*
        Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim
        */


    }
}
