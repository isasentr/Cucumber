package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class _05_DataTableSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc=new DialogContent();

    FormContent fr=new FormContent();
    @And("Click on the element in the left nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            ln.findAndClick(listElement.get(i));
            
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));

        }
    }

    @And("User Sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);  //2 boyutlu hale getirdi
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
            //listin ilke elemeanına(webelemnt adı)  ikinci elemanı yani değeri gönder
        }
    }

    @And("User Delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);  //2 boyutlu hale getirdi

        for (int i = 0; i < listElement.size(); i++) {
            dc.SearchAndDelete(listElement.get(i));
            //listin ilke elemeanına(webelemnt adı)  ikinci elemanı yani değeri gönder
        }
    }

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            fr.findAndClick(listElement.get(i));

        }
    }
}

