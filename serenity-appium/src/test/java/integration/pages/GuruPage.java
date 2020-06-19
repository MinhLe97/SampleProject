package integration.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
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

    private AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    String customerid = "";

    String username = "mngr266589";
    String password = "yrArezE";
    String customerName = "Minh Tran test";
    String customerDob = "01/01/1999";
    String customerAddress = "123 ABC";
    String customerCity = "Ho Chi Minh";
    String customerState = "GA";
    String customerPin = "111111";
    String customerMobileNumber = "0123456789";
    String customerEmail = "minh+1@gmail.com";
    String customerPassword = "Changeit@123";

    By userNameTextBox = By.name("uid");
    By passwordTextBox = By.name("password");
    By customerLink = By.linkText("New Customer");
    By managerId = By.xpath("//*[@class='heading3']/child::*");
    By customerNameTextBox = By.name("name");
    By dateOfBirth = By.name("dob");
    By addressTextBox = By.name("addr");
    By cityTextBox = By.name("city");
    By stateTextBox = By.name("state");
    By pinTextBox = By.name("pinno");
    By mobileTextBox = By.name("telephoneno");
    By emailTextBox = By.name("emailid");
    By customerPasswordTextBox = By.name("password");
    By submitButton = By.name("sub");
    By customerId = By.xpath("//*[text()='Customer ID']/following::*");
    By deleteCustomerLink = By.linkText("Delete Customer");
    By customerIdTextBox = By.name("cusid");
    By submitDeleteCustomer = By.name("AccSubmit");

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
        getDriver().findElement(dateOfBirth).sendKeys(customerDob);
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
        getDriver().findElement(submitButton).click();
    }
    public void VerifyCustomerId() {
        Assert.assertTrue(getDriver().findElement(customerId).isDisplayed());
        String actualCustomerId = getDriver().findElement(customerId).getText();
        customerid = actualCustomerId;
    }

    public void Cleanup() {
        getDriver().findElement(deleteCustomerLink).click();
        getDriver().findElement(customerIdTextBox).sendKeys(customerid);
        getDriver().findElement(submitDeleteCustomer).click();
    }
}
