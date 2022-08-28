package Pages;

import Utilities.GenelWD;
import org.openqa.selenium.WebElement;
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

    WebElement myElement;

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
        }

        clickFunction(myElement);

//        if (myElement==gradeLevel||myElement==gradeLevel1||myElement==academicPeriod1){
//            GenelWD.wait(1);
//        }
    }

}

