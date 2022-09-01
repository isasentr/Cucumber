package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInExcel {
    public static void main(String[] args) throws IOException {
        // var olan bir excel yazma işlemi
        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path); // okuma modunda açılsın
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1"); // login

        //Hafızada oluşturma ve yazma işlemleri yapılıyor
        for (int i = 0; i < 3; i++) {
            Row yenisatir = sheet.createRow(i); // satır oluşturuldu  0 yerine
            Cell yeniHUcre = yenisatir.createCell(i); // yeni satırda ilk hücre oluşturuldu.
            yeniHUcre.setCellValue("isa şen");// bilgi yazıldı

            for (int j = 1; j < 10; j++) {
                yenisatir.createCell(j).setCellValue(j);
            }
        }
        //sıra kaydetmeye geldi bütün bilgiler hafızada buraya kadar , her şey WorkBook da
        inputStream.close();//okuma modunu kapattım , çünkü yazma modunda açmam gerekiyor.

        //Yazma işlemini Yazma modunda açıp öylr yapacağız
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();//hafızayı boşalttım
        outputStream.close();
        System.out.println("işlem tamamlandı");

    }
}
