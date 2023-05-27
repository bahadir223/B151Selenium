package techproed.day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "src/resources/drivers/chromedriver.exe");
        WebDriver myDriver = new ChromeDriver();

        //Browser'in konumunu yazdiralim.
        System.out.println("Sayfanin konumu : " + myDriver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim.
        System.out.println("Sayfanin Boyutlari : " + myDriver.manage().window().getSize());

        //Browser'i maximize yapalim.
        myDriver.manage().window().maximize();
        /*
        Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir.Ve açılan browser'daki
        webElementlere browser maximize olmadigi icin ulaşamayabiliiriz.Dolayısı ile browser'i actiktan sonra
        maximize yaparsak driver bütün webElement'leri görür ve rahatlikla müdahale edebilir.Bu yüzden
        browser'i actiktan sonra ilk olarak myDriver.manage().window().maximize(); yapmamiz bizim webElement'lere
        ulaşmada işimizi kolaylastirir.Böylelikle fail almamis oluruz.
         */

        //Techproeducation'a sayfasina gidelim.
        myDriver.get("https://www.techproeducation.com");

        //Browser'in konumunu yazdiralim.
        System.out.println("Sayfanin yeni konumu : " + myDriver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim.
        System.out.println("Sayfanin Yeni Boyutu: " + myDriver.manage().window().getSize());

        //Sayfayi minimize yapalim.
        myDriver.manage().window().minimize();

        //Sayfayi fullScreen yapalim.
        myDriver.manage().window().fullscreen();

        Thread.sleep(3000);
        myDriver.manage().window().setPosition(new Point(500, 500));//istediginiz konuma getirir.
        myDriver.manage().window().setSize(new Dimension(600, 900));//istediginiz boyuta getirir.
        Thread.sleep(3000);

        myDriver.close();



    }
}
