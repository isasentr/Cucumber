package Pages;

import Utilities.GenelWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent
{
    public DialogContent() {
        PageFactory.initElements(GenelWD.getDriver(), this);
    }

    @FindBy (id = "mat-input-0")
    private WebElement username;

    @FindBy (id = "mat-input-1")
    private WebElement password;

    @FindBy (css = "[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy (xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;


    WebElement myElement;
    public void findAndSend(String strElement,String value){

        switch (strElement){
            case "username":myElement=username;break;
            case "password":myElement=password;break;
        }
        sendKeysFunction (myElement,value);
    }

    public void findAndClick(String strElement){

        switch (strElement){
            case "loginButton":myElement=loginButton;break;
        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement,String text){

        switch (strElement){
            case "dashboard":myElement=dashboard;break;
        }
        verifyContainsText(myElement,text);
    }


}


