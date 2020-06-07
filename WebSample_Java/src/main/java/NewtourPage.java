import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewtourPage {
    WebDriver driver;
    String pageURL = "http://newtours.demoaut.com/mercurywelcome.php";
    By signOn_btn = By.linkText("SIGN-ON");
    By userName_txtbx = By.name("userName");
    By password_txtxbx = By.name("password");
    By login_btn = By.name("login");
    By oneWay_rdibtn = By.xpath("//input[@value='oneway']");
    By arrivingIn = By.name("toPort");
    By continue_btn = By.name("findFlights");
    By departInfo = By.xpath("(//*[text()= 'DEPART']/following::font)[1]");
    By signOff_btn = By.linkText("SIGN-OFF");

    public NewtourPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoLoginPage() {
        driver.get(pageURL);
    }

    public void clickSignOnButton() {
        driver.findElement(signOn_btn).click();
    }

    public void setEmailField() {
        driver.findElement(userName_txtbx).sendKeys("minh");
    }

    public void setPasswordField() {
        driver.findElement(password_txtxbx).sendKeys("minh");
    }

    public void clinkLoginButton() {
        driver.findElement(login_btn).click();
    }

    public void clinkOnewayRadioButton() {
        driver.findElement(oneWay_rdibtn).click();
    }

    public void selectArrivingIn () {
       Select value = new Select(driver.findElement(arrivingIn));
       value.selectByValue("London");
    }

    public void clickContinueButton() {
        driver.findElement(continue_btn).click();
    }

    public String getDepartInfo() {
        return driver.findElement(departInfo).getText();
    }

    public void clickSignOff() {
        driver.findElement(signOff_btn).click();
    }
}
