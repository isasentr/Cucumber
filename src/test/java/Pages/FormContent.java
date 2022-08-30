package Pages;

import Utilities.GenelWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(GenelWD.getDriver(), this);
    }

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement academicPeriod2;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement gradeLevel1;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement gradeLevel2;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[3]")
    private WebElement gradeLevel3;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[4]")
    private WebElement gradeLevel4;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[5]")
    private WebElement gradeLevel5;


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
            case "firstname": myElement = firstname;break;
            case "lastName": myElement = lastName;break;
            case "employeeId": myElement = employeeId;break;
            case "documentNumber": myElement = documentNumber;break;
            case "country": myElement = country;break;
        }
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "academicPeriod": myElement = academicPeriod;break;
            case "academicPeriod1": myElement = academicPeriod1;break;
            case "academicPeriod2": myElement = academicPeriod2;break;

            case "gradeLevel": myElement = gradeLevel;break;
            case "gradeLevel1": myElement = gradeLevel1;break;
            case "gradeLevel2": myElement = gradeLevel2;break;
            case "gradeLevel3": myElement = gradeLevel3;break;
            case "gradeLevel4": myElement = gradeLevel4;break;
            case "gradeLevel5": myElement = gradeLevel5;break;
            case "gender": myElement = gender;break;
            case "male": myElement = male;break;
            case "female": myElement = female;break;
            case "employeeType": myElement = employeeType;break;
            case "teacher": myElement = teacher;break;
            case "supervisor": myElement = supervisor;break;
            case "other": myElement = other;break;
            case "documentType": myElement = documentType;break;
            case "passport":myElement = passport;break;
            case "birthSertificate": myElement = birthSertificate;break;
            case "contact": myElement = contact;break;
        }

        clickFunction(myElement);

//        if (myElement==gradeLevel||myElement==gradeLevel1||myElement==academicPeriod1){
//            GenelWD.wait(1);
//        }
    }
    public void actionFunction() {

        Actions act=new Actions(GenelWD.getDriver());
        Action aksiyon=act
                .keyDown(Keys.ESCAPE)
                .keyUp(Keys.ESCAPE)
                .build();
        aksiyon.perform();
    }

}

