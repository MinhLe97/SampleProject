package integration.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class GuruPage extends PageObject {
    public GuruPage(WebDriver driver) {
        super(driver);
    }

    private AndroidDriver<MobileElement> androidDriver() {
        return (AndroidDriver<MobileElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    String customerid = "";
    String accountid = "";

    String username = "mngr266589"; //Generate new username here http://demo.guru99.com/
    String password = "yrArezE";
    String customerName = "Minh Tran test";
    String customerAddress = "123 ABC";
    String customerCity = "Ho Chi Minh";
    String customerState = "GA";
    String customerPin = "111111";
    String customerMobileNumber = "0123456789";
    String customerEmail = "minh+5@gmail.com";
    String customerPassword = "Changeit@123";
    Integer baseAmount = 10000;
    Integer depositAmount = 200;
    String desc = "Test";

    By userNameTextBox = By.name("uid");
    By passwordTextBox = By.name("password");
    By customerLink = By.linkText("New Customer");
    By managerId = By.xpath("//*[@class='heading3']/child::*");
    By customerNameTextBox = By.name("name");
    By dateOfBirth = By.name("dob");
    By setDateOfBirth = By.id("android:id/button1");
    By addressTextBox = By.name("addr");
    By cityTextBox = By.name("city");
    By stateTextBox = By.name("state");
    By pinTextBox = By.name("pinno");
    By mobileTextBox = By.name("telephoneno");
    By emailTextBox = By.name("emailid");
    By customerPasswordTextBox = By.name("password");
    By customerId = By.xpath("//*[text()='Customer ID']/following-sibling::*");
    By accountLink = By.linkText("New Account");
    By initialDepositTextBox = By.name("inideposit");
    By accountId = By.xpath("//*[text()='Account ID']/following-sibling::*");
    By currentAmount = By.xpath("//*[text()='Current Amount']/following-sibling::*");
    By depositLink = By.linkText("Deposit");
    By accountNoTextBox = By.name("accountno");
    By depositAmountTextBox = By.name("ammount");
    By descTextBox = By.name("desc");
    By deleteAccountLink = By.linkText("Delete Account");
    By deleteCustomerLink = By.linkText("Delete Customer");
    By customerIdTextBox = By.name("cusid");
    By submitDelete = By.name("AccSubmit");
    By currentBalance = By.xpath("//*[text()='Current Balance']/following-sibling::*");

    public void GoToGuruPage() {
        getDriver().get("http://demo.guru99.com/v4/index.php");
    }

    public void InputUserName() {
        getDriver().findElement(userNameTextBox).sendKeys(username);
    }
    public void InputPassword() {
        getDriver().findElement(passwordTextBox).sendKeys(password);
    }
    public void Login() {
        getDriver().findElement(passwordTextBox).sendKeys(Keys.ENTER);
    }
    public void VerifyLogin() {
        String actualManagerId = getDriver().findElement(managerId).getText();
        Assert.assertEquals(actualManagerId, "Manger Id : " + username);
    }

    public void ClickAddCustomer() {
        getDriver().findElement(customerLink).click();
    }
    public void InputCustomerName() {
        getDriver().findElement(customerNameTextBox).sendKeys(customerName);
    }
    public void InputCustomerDob() {
        getDriver().findElement(dateOfBirth).click();
        androidDriver().context("NATIVE_APP");
        androidDriver().findElement(setDateOfBirth).click();
        androidDriver().context("CHROMIUM");
    }
    public void InputCustomerAddress() {
        getDriver().findElement(addressTextBox).sendKeys(customerAddress);
    }
    public void InputCustomerCity() {
        getDriver().findElement(cityTextBox).sendKeys(customerCity);
    }
    public void InputCustomerState() {
        getDriver().findElement(stateTextBox).sendKeys(customerState);
    }
    public void InputCustomerPin() {
        getDriver().findElement(pinTextBox).sendKeys(customerPin);
    }
    public void InputCustomerMobile() {
        getDriver().findElement(mobileTextBox).sendKeys(customerMobileNumber);
    }
    public void InputCustomerEmail() {
        getDriver().findElement(emailTextBox).sendKeys(customerEmail);
    }
    public void InputCustomerPassword() {
        getDriver().findElement(customerPasswordTextBox).sendKeys(customerPassword);
    }
    public void ClickSubmitButton() {
        getDriver().findElement(customerPasswordTextBox).sendKeys(Keys.ENTER);
    }
    public void VerifyCustomerId() {
        Assert.assertTrue(getDriver().findElement(customerId).isDisplayed());
        String actualCustomerId = getDriver().findElement(customerId).getText();
        customerid = actualCustomerId;
    }

    public void ClickAddNewAccount() {
        getDriver().findElement(accountLink).click();
    }

    public void InputCustomerId() {
        getDriver().findElement(customerIdTextBox).sendKeys(customerid);
    }

    public void InputInitialDepositTextBox() {
        getDriver().findElement(initialDepositTextBox).sendKeys(baseAmount.toString());
    }

    public void SubmitNewAccount() {
        getDriver().findElement(initialDepositTextBox).sendKeys(Keys.ENTER);
    }

    public void VerifyNewAccount() {
        Assert.assertTrue(getDriver().findElement(accountId).isDisplayed());
        String verifyAccountId = getDriver().findElement(accountId).getText();
        accountid = verifyAccountId;
    }

    public void VerifyCurrentAmount() {
        String actualAmount =getDriver().findElement(currentAmount).getText();
        Assert.assertEquals(actualAmount, baseAmount.toString());
    }

    public void ClickDeposit() {
        getDriver().findElement(depositLink).click();
    }

    public void InputAccountNo() {
        getDriver().findElement(accountNoTextBox).sendKeys(accountid);
    }

    public void InputDepositAmountTextBox() {
        getDriver().findElement(depositAmountTextBox).sendKeys(depositAmount.toString());
    }

    public void InputDesc() {
        getDriver().findElement(descTextBox).sendKeys(desc);
    }

    public void SubmitDeposit() {
        getDriver().findElement(descTextBox).sendKeys(Keys.ENTER);
    }

    public void VerifyDeposit() {
        String actualCurrentBalance = getDriver().findElement(currentBalance).getText();
        Assert.assertEquals(Integer.parseInt(actualCurrentBalance), (baseAmount + depositAmount));
    }

    public void Cleanup() {
        getDriver().findElement(deleteAccountLink).click();
        getDriver().findElement(accountNoTextBox).sendKeys(accountid);
        getDriver().findElement(submitDelete).click();
        getAlert().accept();
        getAlert().accept();
        getDriver().findElement(deleteCustomerLink).click();
        getDriver().findElement(customerIdTextBox).sendKeys(customerid);
        getDriver().findElement(submitDelete).click();
        getAlert().accept();
        getAlert().accept();
    }
}
