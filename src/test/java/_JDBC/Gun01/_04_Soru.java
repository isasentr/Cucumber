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
int say=0;
        while(rs.next()){
            System.out.println(rs.getString(2));
            say++;

        }
        System.out.println(say);
    }

    @Test
    private void test2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");
        int say=1;
        while(rs.absolute(say)){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            say++;

        }
        System.out.println(say);
    }

    @Test
    private void test3() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");
        int say=0;
        while(rs.relative(1)){
            System.out.println(rs.getString(2));
            say++;

        }
        System.out.println(say);
    }
}
