package integration;

import integration.serenitySteps.GuruStep;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/integration/resources/features/guru.feature" ,
        plugin = {"json:target/cucumber_json/cucumber.json"} )

public class GuruWebTest {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    public GuruStep guruStep;

    public void GuruLogin() {
        try {
            guruStep.GoToGuruPage();
            guruStep.InputUserName();
            guruStep.InputPassword();
            guruStep.Login();
            guruStep.VerifyLogin();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void GuruAddUser() {
        try {
            guruStep.ClickAddCustomer();
            guruStep.InputCustomerName();
            guruStep.InputCustomerDob();
            guruStep.InputCustomerAddress();
            guruStep.InputCustomerCity();
            guruStep.InputCustomerState();
            guruStep.InputCustomerPin();
            guruStep.InputCustomerMobile();
            guruStep.InputCustomerEmail();
            guruStep.InputCustomerPassword();
            guruStep.ClickSubmitButton();
            guruStep.VerifyCustomerId();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Cleanup() {
        try {
            guruStep.Cleanup();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
