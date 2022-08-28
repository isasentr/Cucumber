package Pages;

import Utilities.GenelWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GenelWD.getDriver(), this);
    }

    @FindBy(xpath = "(//button[contains(text(),'Accept all cookies')])[1]")
    private WebElement acceptCookies;
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement intcodeInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialog;

    @FindBy(xpath = "(//span[text()='Academic Period'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstname;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastName;

    @FindBy(xpath = "//mat-select[@formcontrolname='gender']")
    private WebElement gender;

    @FindBy(xpath = "//span[text()=' Male ']")
    private WebElement male;

    @FindBy(xpath = "//span[text()=' Female ']")
    private WebElement female;

    @FindBy(xpath = "//mat-select[@formcontrolname='types']")
    private WebElement employeeType;

    @FindBy(xpath = "//span[text()=' Teacher ']")
    private WebElement teacher;

    @FindBy(xpath = "//span[text()=' Supervisor ']")
    private WebElement supervisor;

    @FindBy(xpath = "//span[text()=' Other ']")
    private WebElement other;
    @FindBy(xpath = "//input[@formcontrolname='employeeId']")
    private WebElement employeeId;

    @FindBy(xpath = "(//mat-select//div[@class='mat-select-value ng-tns-c93-97'])[1]")
    private WebElement documentType;

    @FindBy(xpath = "(//span[text()=' Passport '])")
    private WebElement passport;

    @FindBy(xpath = "(//span[text()=' Birth Certificate '])")
    private WebElement birthSertificate;

    @FindBy(xpath = "//input[@formcontrolname='documentNumber']")
    private WebElement documentNumber;

    @FindBy(xpath = "//div[text()='Contact & Address']")
    private WebElement contact;

    @FindBy(xpath = "//input[@formcontrolname='country']")
    private WebElement country;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
            case "intcodeInput":
                myElement = intcodeInput;
                break;
            case "priorityInput":
                myElement = priorityInput;
                break;
            case "firstname":
                myElement = firstname;
                break;
            case "lastName":
                myElement = lastName;
                break;
            case "employeeId":
                myElement = employeeId;
                break;
                case "documentNumber":
                myElement = documentNumber;
                break;
                case "country":
                myElement = country;
                break;


        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "acceptCookies":
                myElement = acceptCookies;
                break;
            case "loginButton":
                myElement = loginButton;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "deleteDialog":
                myElement = deleteDialog;
                break;
            case "gender":
                myElement = gender;
                break;
            case "male":
                myElement = male;
                break;
            case "female":
                myElement = female;
                break;
            case "employeeType":
                myElement = employeeType;
                break;
            case "teacher":
                myElement = teacher;
                break;
            case "supervisor":
                myElement = supervisor;
                break;
            case "other":
                myElement = other;
                break;
            case "documentType":
                myElement = documentType;
                break;
            case "passport":
                myElement = passport;
                break;
            case "birthSertificate":
                myElement = birthSertificate;
                break;
                case "contact":
                myElement = contact;
                break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "dashboard":
                myElement = dashboard;
                break;
            case "successMessage":
                myElement = successMessage;
                break;
            case "alreadyExist":
                myElement = alreadyExist;
                break;
        }

        verifyContainsText(myElement, text);
    }

    public void SearchAndDelete(String searchText) {
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

//        WebDriverWait wait = new WebDriverWait(GenelWD.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.stalenessOf(deleteButton));
        waitUntilLoading();
//        GenelWD.wait(2); // TODO: incelenecek
        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialog");// dilogdaki silme butonuna bas
    }

}


