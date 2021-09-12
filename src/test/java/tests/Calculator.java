package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

    @Test
    public void task1(){
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        WebElement search = driver.findElement(By.cssSelector("input.gLFyf.gsfi")); //поле поиска
        search.sendKeys("Calculator", Keys.ENTER); //ввести слово калькулятор и нажать enter
        driver.quit();
    }
}
