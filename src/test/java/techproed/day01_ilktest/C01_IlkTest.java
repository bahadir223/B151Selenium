package techproed.day01_ilktest;

public class C01_IlkTest {

    public static void main(String[] args) {
        System.setProperty("chromedriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında System özelliklerini ayarlamak için setProperty methodu kullanırız.
        System.out.println(System.getProperty("chromedriver"));
        //getProperty ile "Key" degerini girerek "value"ya ulasabilirim.
    }
}
