package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class CatchyPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    static WebDriverWait wait;

    static By userName = By.xpath("//input[@placeholder='Username']");
    static By password = By.xpath("//input[@placeholder='Password']");
    static By loginBtn = By.xpath("//div[contains(text(), 'Login')]");
    static By openMoney = By.xpath("//div[contains(text(), 'Open Money Transfer')]");
    static By transferMoney = By.xpath("//div[contains(text(), 'Transfer money')]");
    static By receiverAccount =  By.xpath("//option[@value='528e70c4-381b-4331-9955-e77a9bf72660']");
    static By amountDeger = By.cssSelector("input.css-11aywtz");
    static By sendButon = By.xpath("//div[contains(@class, 'css-175oi2r')]/div[text()='Send']");
    static By gonderilenAmount = By.xpath("//div[contains(@class, 'r-1b43r93') and contains(text(), '115.00')]");
    static By editAccount = By.xpath("//div[contains(text(), 'Edit account')]");
    static By updateButon = By.xpath("//div[contains(text(), 'UPDATE')]");
    static By yeniAd = By.xpath("//div[contains(text(), 'merveaksoyyy')]");
    static By addMoney = By.xpath("//div[contains(text(), 'Add money')]");
    static By addButon = By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']/div[@class='css-146c3p1 r-jwli3a r-1b43r93']");

    static By errorMessage = By.xpath("//div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1pi2tsx r-13qz1uu']//div[4]/div[@class='css-146c3p1 r-yv33h5 r-1jb9un0 r-1enofrn r-14gqq1x']");


    public CatchyPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public static void AnaSayfa() {

    }

    public static void userNamePlaceholder() {
        elementHelper.click(userName);
        elementHelper.sendKey(userName, "merve.aksoy@testinium.com");
    }
    public static void passwordPlaceholder() {
        elementHelper.click(password);
        elementHelper.sendKey(password, "Pgs135*-");
    }

    public static void loginButon() {
        elementHelper.click(loginBtn);
    }

    public static void openMoneyTransferButon() {
        elementHelper.click(openMoney);

    }

    public static void transferMoneyButon() {
            elementHelper.findElement(transferMoney);
            elementHelper.click(transferMoney);


    }
    public static void senderAccount() {

    }

    public static void receiverAccount() {
        elementHelper.click(receiverAccount);
    }

    public static void amount() {
        elementHelper.click(amountDeger);
        elementHelper.sendKey(amountDeger, "15");

    }

    public static void sendButon() {
        elementHelper.click(sendButon);
    }

    public static void gonderilenAmount() {
        elementHelper.findElement(gonderilenAmount);
        Assert.assertEquals(gonderilenAmount, "15");
    }


    public static void editAccountButonu() {
        elementHelper.click(editAccount);
    }

    public static void yeniAccountAd() {
        elementHelper.findElement(amountDeger);
        elementHelper.clear(amountDeger);
        elementHelper.sendKey(amountDeger, "merveaksoyyy");


    }

    public static void updateButonu() {
        elementHelper.click(updateButon);
    }

    public static void checkYeniAd() {
        elementHelper.checkVisible(yeniAd);
    }

    public static void addMoneyButonu() {
        elementHelper.click(addMoney);
    }

    public static void addButonu() {
        elementHelper.click(addButon);
    }

    public static void checkMessage(String cardHolder) {
        elementHelper.checkVisible(errorMessage);
    }
}
