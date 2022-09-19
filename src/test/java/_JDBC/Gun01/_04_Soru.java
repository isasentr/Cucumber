package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Soru extends JDBCParent {
    // city tablosundaki tüm kayıtları next ile yazdırınız
    // city tablosundaki tüm kayıtları absolute ile yazdırınız
    // city tablosundaki tüm kayıtları relative ile yazdırınız.
    @Test
    private void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        for (int i = 1; i <rs. ; i++) {
            rs.next();
            String dilAdi=rs.getRow(i);
            System.out.println("dilAdi="+dilAdi);
        }


    }
}
