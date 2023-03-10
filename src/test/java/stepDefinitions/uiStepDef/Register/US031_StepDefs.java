package stepDefinitions.uiStepDef.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import utilities.BrowserUtilities;
import java.util.List;
import static stepDefinitions.Hooks.commonPage;
import static utilities.BrowserUtilities.assertTextColor;
import static utilities.BrowserUtilities.cleanTextFromWebelemnt;

public class US031_StepDefs extends CommonPage {

    String red = "rgba(245, 110, 105, 1";
    String black = "rgba(72, 72, 72, 1";

    @Given("user clicks on registration button on the navbar")
    public void user_clicks_on_registration_button_on_the_navbar() {
        getHomePage().registerButton.click();

    }

    @When("user enter letter to first name box on the registration form")
    public void user_enter_letter_to_first_name_box_on_the_registration_form(io.cucumber.datatable.DataTable dataTable) {
        BrowserUtilities.wait(2);
        List<String> text = dataTable.column(0);
        List<String> color = dataTable.column(1);

        for (int i = 0; i < text.size(); i++) {
            commonPage.getRegisterPage().registrationFirstName.sendKeys(text.get(i));
            assertTextColor(color.get(i), commonPage.getRegisterPage().registrationFirstName);
            cleanTextFromWebelemnt(commonPage.getRegisterPage().registrationFirstName);
        }
    }
    @And("user enter middle name in to middle name box on the registration form")
    public void userEnterMiddleInToMiddleNameBoxOnTheRegistrationForm() {
        BrowserUtilities.wait(2);
        getRegisterPage().registrationMiddleName.sendKeys("sevinc" + Keys.ENTER);

    }

    @When("user enter letter to last name box on the registration form")
    public void userEnterLetterToLastNameBoxOnTheRegistrationForm(io.cucumber.datatable.DataTable dataTable) {
        BrowserUtilities.wait(2);
        List<String> text = dataTable.column(0);
        List<String> color = dataTable.column(1);

        for (int i = 0; i < text.size(); i++) {
            commonPage.getRegisterPage().registrationLastName.sendKeys(text.get(i));
            assertTextColor(color.get(i), commonPage.getRegisterPage().registrationLastName);
            cleanTextFromWebelemnt(commonPage.getRegisterPage().registrationLastName);
        }
    }

    @Then("user enter letter to email address  box on the registration form")
    public void userEnterLetterToEmailAddressBoxOnTheRegistrationForm(io.cucumber.datatable.DataTable dataTable) {
        BrowserUtilities.wait(2);
        List<String> text = dataTable.column(0);
        List<String> color = dataTable.column(1);

        for (int i = 0; i < text.size(); i++) {
            commonPage.getRegisterPage().registrationFormEmailAdd.sendKeys(text.get(i));
            assertTextColor(color.get(i), commonPage.getRegisterPage().registrationFormEmailAdd);
            cleanTextFromWebelemnt(commonPage.getRegisterPage().registrationFormEmailAdd);
        }
    }

    //    @And("user enter valid email address box on the registration form")
//    public void userEnterValidEmailAddressBoxOnTheRegistrationForm() {
//        BrowserUtilities.wait(3);
//        getRegisterPage().registrationFormEmailAdd.sendKeys("sevinc@gmail.com" + Keys.ENTER);
//    }
    @And("user enters valid password")
    public void userEntersValidPassword() {
        BrowserUtilities.wait(2);
        BrowserUtilities.cleanTextFromWebelemnt(getRegisterPage().registrationFormPassword);
        getRegisterPage().registrationFormPassword.sendKeys("12345Aa!" + Keys.ENTER);
    }
    @And("user enters valid confirm password")
    public void userEntersValidConfirmPassword() {
        BrowserUtilities.wait(3);
        BrowserUtilities.cleanTextFromWebelemnt(getRegisterPage().registrationFormConfirmPassword);
        getRegisterPage().registrationFormConfirmPassword.sendKeys("12345Aa!" + Keys.ENTER);
    }
    @Then("user enter code in to zip code box")
    public void userEnterCodeInToZipCodeBox() {
        BrowserUtilities.wait(2);
        getRegisterPage().registrationFormZipCode.sendKeys("12345" + Keys.ENTER);

    }
}
