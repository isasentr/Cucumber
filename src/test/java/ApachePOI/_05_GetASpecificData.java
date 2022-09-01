package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */
public class _05_GetASpecificData {
    public static void main(String[] args) {
        System.out.print("Aranacak kelime=");
        Scanner oku = new Scanner(System.in);
        String arananKelime = oku.next();

        String donenSonuc = bul(arananKelime);
        System.out.println("donensonuc="+donenSonuc);
    }

    public static String bul(String arananKelime) {


        String donecek = "";

        String path = "src/test/java/ApachePOI/LoginData.xlsx";
        Workbook workbook = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {   //IOException 2 sinide kapsıyor.
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheetAt(0); // .getSheet("Login");

        for (int i = 0; i <sheet.getPhysicalNumberOfRows() ; i++) {
            Row row=sheet.getRow(i);
            Cell cell= row.getCell(0);

            if (cell.toString().equalsIgnoreCase(arananKelime)){
                for (int j = 1; j < row.getPhysicalNumberOfCells(); j++)
                    donecek+=row.getCell(j)+" ";
            }
        }
        return donecek;
    }
}
