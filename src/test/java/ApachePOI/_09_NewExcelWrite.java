package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook(); //yeni work book oluşturma
        XSSFSheet sheet = workbook.createSheet("sayfa1");

        //Hafızada oluşturma ve yazma işlemleri yapılıyor

            Row yenisatir = sheet.createRow(0); // satır oluşturuldu  0 yerine
            Cell yeniHUcre = yenisatir.createCell(0); // yeni satırda ilk hücre oluşturuldu.
            yeniHUcre.setCellValue("isa şen");// bilgi yazıldı

            for (int j = 1; j < 10; j++) {
                yenisatir.createCell(j).setCellValue(j);
            }

        //Yazma işlemini Yazma modunda açıp öylr yapacağız
        String yeniExcelPath="src/test/java/ApachePOI/resource/yeniExcelPath.xlsx";
        FileOutputStream outputStream = new FileOutputStream(yeniExcelPath);
        workbook.write(outputStream);
        workbook.close();//hafızayı boşalttım
        outputStream.close();
        System.out.println("işlem tamamlandı");

    }
}