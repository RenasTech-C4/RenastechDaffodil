package code.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_locatorsPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        //Xpath second way //tagname[.='text']
       // driver.findElement(By.xpath("//a[.='Software Testing']")).click();

        //absolute xpath
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/ul[1]/li[1]/a")).click();




    }
}
