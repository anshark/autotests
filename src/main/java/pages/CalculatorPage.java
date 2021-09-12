package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalculatorPage {

    @FindBy(xpath = "//div[@role='button' and text()='0']")
    public WebElement button0;

    @FindBy(xpath = "//div[@role='button' and text()='1']")
    public WebElement button1;

    @FindBy(xpath = "//div[@role='button' and text()='2']")
    public WebElement button2;

    @FindBy(xpath = "//div[@role='button' and text()='3']")
    public WebElement button3;

    @FindBy(xpath = "//div[@role='button' and text()='4']")
    public WebElement button4;

    @FindBy(xpath = "//div[@role='button' and text()='5']")
    public WebElement button5;

    @FindBy(xpath = "//div[@role='button' and text()='6']")
    public WebElement button6;

    @FindBy(xpath = "//div[@role='button' and text()='(']")
    public WebElement openParenthesis;

    @FindBy(xpath = "//div[@role='button' and text()=')']")
    public WebElement closeParenthesis;

    @FindBy(xpath = "//div[@role='button' and text()='+']")
    public WebElement plus;

    @FindBy(xpath = "//div[@role='button' and @aria-label='вычитание']")
    public WebElement minus;

    @FindBy(xpath = "//div[@role='button' and @aria-label='умножение']")
    public WebElement multiplication;

    @FindBy(xpath = "//div[@role='button' and @aria-label='деление']")
    public WebElement divide;

    @FindBy(xpath = "//div[@role='button' and @aria-label='равно']")
    public WebElement equals;

    @FindBy(xpath = "//span[@id='cwos']")
    public WebElement result;


    public CalculatorPage(WebDriver driver) {
        initElements(driver, this);
    }
}
