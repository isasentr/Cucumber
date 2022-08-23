package StepDefinitions;

import Pages.DialogContent;
import Utilities.GenelWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//richfield.edu
//Richfield2020!

public class _01_LoginSteps {

    DialogContent klm = new DialogContent();

    @Given("Navigate to basgar")
    public void navigateToBasgar() {

        GenelWD.getDriver().get("https://demo.mersys.io/");
        GenelWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and pasword and click login button")
    public void enterUsernameAndPaswordAndClickLoginButton() {


//        klm.username.sendKeys("richfield.edu");
//        klm.password.sendKeys("Richfield2020!");
//        klm.loginButton.click();

       klm. findAndSend("username","richfield.edu");
       klm. findAndSend("password","Richfield2020!");
       klm.findAndClick("loginButton");

    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
//        Assert.assertTrue(klm.dashboard.getText().contains("Dashboard"));
        klm.findAndContainsText("dashboard","Dashboard");
        klm.findAndClick("acceptCookies");
    }
}
