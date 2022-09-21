package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _07_JDBCSteps {
    @Then("Send the query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {
        //DB den gerekli listeyi alıcam
        List<List<String>> dbList= DBUtility.getListData(sorgu);
        System.out.println("dbList = " + dbList); // 0.satırın 0 elemanı id yani 1,


        //Webdeb ekrandaki isimleri alıcam
        DialogContent dc=new DialogContent();
        List<WebElement> uiList=dc.waitUntilVisibleAllElement(dc.nameList);
      for(WebElement e:uiList )
          System.out.println("e.getText() = " + e.getText());


        //karşılaştırıcam
        for (int i = 0; i < dbList.size(); i++) {
            Assert.assertEquals(dbList.get(i).get(1), uiList.get(i).getText(), "Hatalı Durum");

        }


    }
}
