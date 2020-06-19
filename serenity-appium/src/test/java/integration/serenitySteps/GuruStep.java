package integration.serenitySteps;

import integration.pages.GuruPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class GuruStep extends ScenarioSteps {
    GuruPage guruPage;

    @Step
    public void GoToGuruPage() {
        guruPage.GoToGuruPage();
    }

    @Step
    public void InputUserName() {
        guruPage.InputUserName();
    }

    @Step
    public void InputPassword() {
        guruPage.InputPassword();
    }

    @Step
    public void Login() {
        guruPage.Login();
    }

    @Step
    public void VerifyLogin() {
        guruPage.VerifyLogin();
    }

    @Step
    public void ClickAddCustomer() {
        guruPage.ClickAddCustomer();
    }

    @Step
    public void InputCustomerName() {
        guruPage.InputCustomerName();
    }

    @Step
    public void InputCustomerDob() {
        guruPage.InputCustomerDob();
    }

    @Step
    public void InputCustomerAddress() {
        guruPage.InputCustomerAddress();
    }

    @Step
    public void InputCustomerCity() {
        guruPage.InputCustomerCity();
    }

    @Step
    public void InputCustomerState() {
        guruPage.InputCustomerState();
    }

    @Step
    public void InputCustomerPin() {
        guruPage.InputCustomerPin();
    }

    @Step
    public void InputCustomerMobile() {
        guruPage.InputCustomerMobile();
    }

    @Step
    public void InputCustomerEmail() {
        guruPage.InputCustomerEmail();
    }

    @Step
    public void InputCustomerPassword() {
        guruPage.InputCustomerPassword();
    }

    @Step
    public void ClickSubmitButton() {
        guruPage.ClickSubmitButton();
    }

    @Step
    public void VerifyCustomerId() {
        guruPage.VerifyCustomerId();
    }

    @Step
    public void Cleanup() {
        guruPage.Cleanup();
    }
}
