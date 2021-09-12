package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CalculatorPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator {

    public static WebDriver driver;
    public static CalculatorPage calculatorPage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void task1() {
        driver.get("http://google.com");
        //ввести слово калькулятор в поле поиска и нажать enter
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Calculator", Keys.ENTER);

        calculatorPage = new CalculatorPage(driver);
        //(1 + 2) × 3 - 40 ÷ 5
        calculatorPage.openParenthesis.click();
        calculatorPage.button1.click();
        calculatorPage.plus.click();
        calculatorPage.button2.click();
        calculatorPage.closeParenthesis.click();
        calculatorPage.multiplication.click();
        calculatorPage.button3.click();
        calculatorPage.minus.click();
        calculatorPage.button4.click();
        calculatorPage.button0.click();
        calculatorPage.divide.click();
        calculatorPage.button5.click();
        calculatorPage.equals.click();

        String result = calculatorPage.result.getText();
        assertEquals("1", result);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
