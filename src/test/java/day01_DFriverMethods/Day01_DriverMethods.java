package day01_DFriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();// Bos bir browser açtık
        driver.get("https://www.amazon.com"); // ilk olarak gitmek istediğimiz sayfayı belirtiriz
        System.out.println("Sayfa Başlığı : " + driver.getTitle());
        System.out.println("Sayfa Url'i : " + driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());// Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz



        // sistemde sorun yok hocam siz az once hangi clasi actiniz .mesela bu clasda get current ve gettitle metodunu getirmedi
       // sadece sayfayu acti getirmesi kolarla alakalı bir durum suan selenıum ve intelliji calişiyor tamam da istedigim bilgiyi getirmezse nasil olacak

        //bisey yapmadım caliştirinca geliyorben deneyecegim simdi okey



    }  }