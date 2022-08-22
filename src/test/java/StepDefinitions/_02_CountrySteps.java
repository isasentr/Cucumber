package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.findAndClick("setupOne"); //setup click
        ln.findAndClick("parameters"); // parameters click
        ln.findAndClick("Countries"); // countries click
    }


    @When("Create a country")
    public void createACountry() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","ul55pkfe151");
        dc.findAndSend("codeInput","1of161");
        dc.findAndClick("saveButton");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("codeInput",code);
        dc.findAndClick("saveButton");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");

    }

}
