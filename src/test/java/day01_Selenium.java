import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver.","src/resources/drivers/chromedriver.exe");
/*
En temel haliyle otomasyon yapmak icin Clasimiza otomasyon icin gerekli olan webdriverin yerini gostermek gerekir,Bunun
icin java kutuphanesinden System.setProperty()methodunun icine ilk olarak driveri yazariz.Ikinci olarak driverin fiziki yolunu
kopyalariz.
 */
        WebDriver driver=new ChromeDriver();//objeyi driver olarak yaptik x de olabilirama driveri kullandik
        //string dedigi icin tirnak isareti
        driver.get("https://www.amazon.com");//get metodu disinda metodlar var .getTitle ()icinde olan sayfanin basligini getirir
    }

}
