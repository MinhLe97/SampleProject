package integration.cucumer;

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

    @And("User input UserName")
    public void userInputUserName() {
        guruStep.InputUserName();
    }

    @And("User input Password")
    public void userInputPassword() {
        guruStep.InputPassword();
    }

    @And("User click on Login")
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

    @And("User input customer name")
    public void UserInputCustomerName() {
        guruStep.InputCustomerName();
    }

    @And("User input dob")
    public void UserInputDob() {
        guruStep.InputCustomerDob();
    }

    @And("User input address")
    public void UserInputAddress() {
        guruStep.InputCustomerAddress();
    }

    @And("User input city")
    public void UserInputCity() {
        guruStep.InputCustomerCity();
    }

    @And("User input state")
    public void UserInputState() {
        guruStep.InputCustomerState();
    }

    @And("User input pin")
    public void UserInputPin() {
        guruStep.InputCustomerPin();
    }

    @And("User input mobile number")
    public void UserInputMobile() {
        guruStep.InputCustomerMobile();
    }

    @And("User input email")
    public void UserInputEmail() {
        guruStep.InputCustomerEmail();
    }

    @And("User input password")
    public void UserInputPassword() {
        guruStep.InputCustomerPassword();
    }

    @And("User click submit new customer")
    public void UserClickSubmit() {
        guruStep.ClickSubmitButton();
    }

    @Then("User create new customer successful")
    public void UserCreateSuccessful() {
        guruStep.VerifyCustomerId();
    }

    @Given("User click new account")
    public void ClickAddNewAccount() {
        guruStep.ClickAddNewAccount();
    }

    @And("User input customer Id")
    public void InputCustomerId() {
        guruStep.InputCustomerId();
    }

    @And("User input initial deposit")
    public void InputInitialDepositTextBox() {
        guruStep.InputInitialDepositTextBox();
    }

    @And("User click submit new account")
    public void SubmitNewAccount() {
        guruStep.SubmitNewAccount();
    }

    @Then("User create new account successful")
    public void VerifyNewAccount() {
        guruStep.VerifyNewAccount();
        guruStep.VerifyCurrentAmount();
    }

    @Given("User click deposit")
    public void ClickDeposit() {
        guruStep.ClickDeposit();
    }

    @And("User input accountNo")
    public void InputAccountNo() {
        guruStep.InputAccountNo();
    }

    @And("User input deposit amount")
    public void InputDepositAmountTextBox() {
        guruStep.InputDepositAmountTextBox();
    }

    @And("User input desc")
    public void InputDesc() {
        guruStep.InputDesc();
    }

    @And("User submit deposit")
    public void SubmitDeposit() {
        guruStep.SubmitDeposit();
    }

    @Then("User deposit successful")
    public void VerifyDeposit() {
        guruStep.VerifyDeposit();
    }

    @Then("Cleanup")
    public void Cleanup() {
        guruStep.Cleanup();
    }
}
