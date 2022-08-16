package Pages;

import Utilities.GenelWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent
{
    public DialogContent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "mat-input-0")
    public WebElement username;

    @FindBy (id = "mat-input-1")
    public WebElement password;

    @FindBy (css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy (xpath = "(//span[contains(text(),'Dashboard')])[2]")
    public WebElement dashboard;

}
