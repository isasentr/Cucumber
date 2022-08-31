package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        //Dosyanın yolu alındı.
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

//Dosya okuma işlemcesine yolunu veriyıruz. Böylece prohram ile dosya arasında bağlantı oluştururuz.
        FileInputStream dosyaOkumaBaglantisi= new FileInputStream(path);

        Workbook calismaKitabi = WorkbookFactory.create(dosyaOkumaBaglantisi);

        Sheet calismaSayfasi =  calismaKitabi .getSheet("Sheet1");

        Row satir = calismaSayfasi.getRow(0);

        Cell hucre = satir.getCell(0);

        System.out.printf("hucre="+hucre);
    }
}
