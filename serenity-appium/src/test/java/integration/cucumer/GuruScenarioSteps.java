package integration.cucumer;

//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import integration.serenitySteps.GuruStep;
import net.thucydides.core.annotations.Steps;

public class GuruScenarioSteps {
    @Steps
    GuruStep guruStep;

    @Given("User go to Guru page")
    public void userGoToGuruPage() {
        guruStep.GoToGuruPage();
    }

    @Given("User input UserName")
    public void userInputUserName() {
        guruStep.InputUserName();
    }

    @Given("User input Password")
    public void userInputPassword() {
        guruStep.InputPassword();
    }

    @Given("User click on Login")
    public void userClickOnLogin() {
        guruStep.Login();
    }

    @Then("Login successful")
    public void loginSuccessful() {
        guruStep.VerifyLogin();
    }

    @Given("User click add customer")
    public void clickAddCustomer() {
        guruStep.ClickAddCustomer();
    }

    @Given("User input customer name")
    public void UserInputCustomerName() {
        guruStep.InputCustomerName();
    }

    @Given("User input dob")
    public void UserInputDob() {
        guruStep.InputCustomerDob();
    }

    @Given("User input address")
    public void UserInputAddress() {
        guruStep.InputCustomerAddress();
    }

    @Given("User input city")
    public void UserInputCity() {
        guruStep.InputCustomerCity();
    }

    @Given("User input state")
    public void UserInputState() {
        guruStep.InputCustomerState();
    }

    @Given("User input pin")
    public void UserInputPin() {
        guruStep.InputCustomerPin();
    }

    @Given("User input mobile number")
    public void UserInputMobile() {
        guruStep.InputCustomerMobile();
    }

    @Given("User input email")
    public void UserInputEmail() {
        guruStep.InputCustomerEmail();
    }

    @Given("User input password")
    public void UserInputPassword() {
        guruStep.InputCustomerPassword();
    }

    @Given("User click submit")
    public void UserClickSubmit() {
        guruStep.ClickSubmitButton();
    }

    @Then("User create successful")
    public void UserCreateSuccessful() {
        guruStep.VerifyCustomerId();
    }

    @Then("Cleanup")
    public void Cleanup() {
        guruStep.Cleanup();
    }
}
