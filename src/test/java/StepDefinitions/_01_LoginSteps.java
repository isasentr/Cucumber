package StepDefinitions;

import Pages.DialogContent;
import Utilities.GenelWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;




//richfield.edu
//Richfield2020!


public class _01_LoginSteps  {

    DialogContent klm = new DialogContent(GenelWD.getDriver());

    @Given("Navigate to basgar")
    public void navigateToBasgar() {

        GenelWD. getDriver().get("https://demo.mersys.io/");
        GenelWD.  getDriver().manage().window().maximize();

    }

    @When("Enter username and pasword and click login button")
    public void enterUsernameAndPaswordAndClickLoginButton() {
        WebDriverWait wait = new WebDriverWait(GenelWD.getDriver(), Duration.ofSeconds(30));

//     Duration dr= Duration.ofSeconds(30);
        GenelWD.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece ana sayfa yüklenirken eb başta
        GenelWD.  getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //bütün webelement için geçerli

        klm.username.sendKeys("richfield.edu");
        klm.password.sendKeys("Richfield2020!");
        wait.until(ExpectedConditions.elementToBeClickable(klm.loginButton));
        klm.loginButton.click();
    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        WebDriverWait wait = new WebDriverWait(GenelWD.getDriver(), Duration.ofSeconds(30));

//     Duration dr= Duration.ofSeconds(30);
        GenelWD. getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //sadece ana sayfa yüklenirken eb başta
        GenelWD.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //bütün webelement için geçerli
        wait.until(ExpectedConditions.visibilityOf(klm.dashboard));

        Assert.assertTrue(klm.dashboard.getText().contains("Dashboard"));
    }
}
