package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
public class _10_Soru {
    /*
    public class _09_Tasks {
    /  Soru 1:
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata


    /  Soru 2:
            *  Çarpım tablosunu excele yazdırınız.
            *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
            *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
     */

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("sayfa1");
        for (int i = 1; i < 11; i++) {
             // satır oluşturuldu  0 yerine
//            Cell yeniHUcre = yenisatir.createCell(i); // yeni satırda ilk hücre oluşturuldu.
//            yenisatir.setCellValue("çarpım tablosu");// bilgi yazıldı

            for (int j = 1; j < 11; j++) {
                Row yenisatir = sheet.createRow(i);
                int carpim=i*j;
                yenisatir.createCell(j).setCellValue(i+"x"+j+"="+carpim);

            }

        }
        String path="src/test/java/ApachePOI/resource/isatest.xlsx";
        //Yazma işlemini Yazma modunda açıp öylr yapacağız
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();//hafızayı boşalttım
        outputStream.close();
        System.out.println("işlem tamamlandı");

    }
}