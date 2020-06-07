import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestWeb {
    WebDriver driver = null;
    NewtourPage newtourPage = null;

    @BeforeTest
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Minh/ModelProject/Chromedriver/chromedriver_83.exe");
        driver = new ChromeDriver();
        newtourPage = new NewtourPage(driver);
    }

    @Test
    public void LoginPage() {
        newtourPage.gotoLoginPage();
        newtourPage.clickSignOnButton();
        newtourPage.setEmailField();
        newtourPage.setPasswordField();
        newtourPage.clinkLoginButton();

        Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
    }

    @Test
    public void SelectArriving() {
        newtourPage.clinkOnewayRadioButton();
        newtourPage.selectArrivingIn();
        newtourPage.clickContinueButton();

        Assert.assertEquals(newtourPage.getDepartInfo(), "Acapulco to London");
    }

    @Test
    public void SignOff() {
        newtourPage.clickSignOff();

        Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
    }

    @AfterTest
    public  void CleanUp() {
        driver.quit();
    }
}
