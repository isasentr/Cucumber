package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GenelWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.findAndClick("setupOne"); //setup click
        ln.findAndClick("parameters"); // parameters click
        ln.findAndClick("countries"); // countries click
    }


    @When("Create a country")
    public void createACountry() {
        String randomGenName= RandomStringUtils.randomAlphabetic(8); // heryerde kullanılabilir  poma dependecies eklendi
        String randomGenCode= RandomStringUtils.randomNumeric(4);

        GenelWD.wait(1);
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",randomGenName);
        dc.findAndSend("codeInput",randomGenCode);
//        dc.findAndSend("nameInput",randomGenName);
//        dc.findAndSend("codeInput",randomGenCode);
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
