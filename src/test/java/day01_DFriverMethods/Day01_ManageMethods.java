package day01_DFriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ManageMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver", "src\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        System.out.println("Sayfanin konumu = "+driver.manage().window().getPosition());

    }
}