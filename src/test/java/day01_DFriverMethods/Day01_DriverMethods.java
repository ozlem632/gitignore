package day01_DFriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrom.driver","src\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//bos bir browser actik
        driver.get("https://www.amazon.com");//
        System.out.println("Sayfa basliogi:"+ driver.getTitle());
        System.out.println("sayfa url:"+driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());

    }
}
