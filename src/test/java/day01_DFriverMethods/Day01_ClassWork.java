package day01_DFriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrom.driver","src\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim. https://www.amazon.com/
driver.get("https://www.amazon.com");
//Sayfa basligini(title) yazdirin
       // System.out.println("sayfa basliogi:" + driver.getTitle());
//Sayfa basliginin "Amazon" icerdigini test edin
String actualTitle=driver.getTitle();
if(actualTitle.contains("Amazon")){
    System.out.println();
}
//Sayfa adresini(url) yazdirin
//Sayfa url'inin "amazon" icerdigini test edin.
//Sayfa handle degerini yazdirin
//Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
//Sayfayi kapatin.




    }
}
