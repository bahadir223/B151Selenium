package techproed.day04_Locators_XPath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementLocator {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        // sonuc yazısını yazdırın
        List<WebElement> sonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println(sonucYazisi.get(0).getText());//1-16 of 155 results for "city bike"

        System.out.println("xpath ile yazdırdımmmmmmmmmmm!!!!!");
        //Xpath ile list kullanmadan tek seferde locate aldık
        WebElement sonucYazisiXpath = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println(sonucYazisiXpath.getText());

        System.out.println("xpath ile sonuç sayısı yazdırdık...");
        // sonuc sayısını yazdırın
        String a = sonucYazisiXpath.getText();
        String[] arr = a.split(" ");
        System.out.println(arr[2]);

        // sonuc sayısını yazdırın
        String[] sonucSayisi = sonucYazisi.get(0).getText().split(" ");
        System.out.println("Sonuc Sayisi = " + sonucSayisi[2]);

        //Sayfadaki 12. elementi list kullanmadan xpath'in index özelliğini kullanarak locate aldık

        WebElement onikinciElement = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[12]"));
        System.out.println(onikinciElement.getText());


        // ilk ürünün locatini alın
        List<WebElement> urunler = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = urunler.get(0);

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isDisplayed());//True

        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isEnabled());//True

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isSelected());//False döner çünkü webelement seçilme özelliğine sahip değil

        // ilk urune tıklayın
        ilkUrun.click();//webelementin üzerine tıklar


        // sayfayı kapatın
        driver.close();
    }
            /*
            //ARAMA KUTUSUNUN HTML KODLARI
            <input type="text" value="" name="field-keywords" autocomplete="off"
            placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto"
            tabindex="0" aria-label="Search Amazon" spellcheck="false">
             */
    //Relative Xpath syntax -->  //tagname[@attributeName='atributeValue']
    //input[@type='text']
    //                            (//input[@type='text'])[1]
    //                            //*[@type='text']
    /*
        Aldığımız xpath unique olmadığı zaman xpath'imizi parantez içine alarak index belirtebiliriz.
    Böylelikle webelementleri Liste atıp istediğimiz elementi almakla uğraşmayız.
    Xpath'in değişik kullanma yolları vardır.
     */

    //ODEV!!!!!!!!
    //Techproeducation sayfasına gidelim
    //Çıkan reklamı locate edip kapatalım
    //Arama bölümünde qa aratalım
    //Sayfa başlığının qa içerdiğini doğrulayalım
    //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
    //Carrer Opportunities In QA linkine tıklayalım
    //Başlığın Opportunities içerdiğini test edelim
    //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım

    //https://id.heroku.com/login sayfasina gidin
//Bir mail adersi giriniz
//Bir password giriniz
//Login butonuna tiklayiniz
//"There was a problem with your login." texti gorunur ise
//"kayit yapilamadi" yazdiriniz
//eger yazi gorunur degilse "kayit yapildi" yazdiriniz
//sayfayı kapatiniz


}

