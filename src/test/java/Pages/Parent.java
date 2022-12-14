package Pages;

import Utilities.GenelWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {//3.Aşama

        waitUntilVisible(element); //beklemeyi yap
        scrolltoElement(element); //kaydırmayı yap
        element.clear();      //kutucugu temizle
        element.sendKeys(value);//değeri gönder
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GenelWD.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrolltoElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) GenelWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView", element);
    }

    public void clickFunction(WebElement element) {

        waitUntilClickable(element);
        scrolltoElement(element); //kaydırmayı yap
        element.click();//değeri gönder

    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GenelWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void verifyContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void waitUntilLoading() {
        WebDriverWait wait=new WebDriverWait(GenelWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
    }
    public List<WebElement> waitUntilVisibleAllElement(List<WebElement> elementList) {
        WebDriverWait wait = new WebDriverWait(GenelWD.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));

        return elementList;
    }
}

