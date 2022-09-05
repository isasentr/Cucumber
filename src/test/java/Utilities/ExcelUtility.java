package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {
    //  kendisine verilen path deki excelin, istenilen, sheetindeki
    //   istenilen kolona kadar sütunları okuyup Arraylist formatında geri döndüren fonksiyonu yazınız.
    //   getListData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx","testCitizen", 2); 0-2

    public static ArrayList<ArrayList<String>> getListData(String path,String sheetName ,int columnCount){
        ArrayList<ArrayList<String>> tablo=new ArrayList<>();
        {

            Workbook workbook=null;
            try {
                FileInputStream inputStream = new FileInputStream(path);
                workbook= WorkbookFactory.create(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            Sheet sayfa= workbook.getSheet(sheetName);
            for (int i = 0; i <sayfa.getPhysicalNumberOfRows() ; i++) {
                ArrayList<String>satirData=new ArrayList<>();

                for (int j = 0; j <columnCount ; j++) {
                    satirData.add(sayfa.getRow(i).getCell(j).toString());
                }
                tablo.add(satirData);
            }
        }
        return tablo;
    }

    //kendi içinde unit test oldu
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> tablo= getListData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen",3);

        System.out.println("tablo = " + tablo);
    }
}