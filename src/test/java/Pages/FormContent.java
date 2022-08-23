package Pages;

import Utilities.GenelWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(GenelWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Academic Period'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//span[contains(text(),' 2021-2022 ')]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "//mat-form-field[@formgroupname='gradeLevel']")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement gradeLevel1;

    WebElement myElement;

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "academicPeriod": myElement = academicPeriod;break;
            case "academicPeriod1": myElement = academicPeriod1;break;
            case "gradeLevel": myElement = gradeLevel;break;
            case "gradeLevel1": myElement = gradeLevel1;break;
        }

        clickFunction(myElement);

        if (myElement==gradeLevel||myElement==gradeLevel1||myElement==academicPeriod1){
            GenelWD.wait(1);
        }
    }

}

