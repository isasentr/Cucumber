package Pages;

import Utilities.GenelWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GenelWD.getDriver(), this);
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy (xpath = "(//span[text()='Parameters'])[1]")
    private WebElement parameters;

    @FindBy (xpath = "//span[text()='Countries']")
    private WebElement countries;

    WebElement myElement;
    public void findAndClick(String strElement){
        switch (strElement){
            case "setupOne":myElement=setupOne;break;
            case "parameters":myElement=parameters;break;
            case "Countries":myElement=countries;break;
        }
        clickFunction(myElement);
    }
}
