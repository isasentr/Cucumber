package _JDBC.Gun02;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetAllRowColumn extends JDBCParent {
    @Test()
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select*from language");

        // ResultSet: data+meta (data dışındaki bilgiler kolon sayısı vs...

        ResultSetMetaData rsmd = rs.getMetaData();

        // sonuçların haricindeki diğer bilgiler; kolon sayısı , isimleri , tipleri

        int columnCount = rsmd.getColumnCount();

        System.out.println("columnCount=" + columnCount);

        for (int i = 1; i <= columnCount; i++) {

            String columnName = rsmd.getColumnName(i);
            String columnType = rsmd.getColumnTypeName(i);

            System.out.print("columnType=" + columnType);
            System.out.println(", columnName=" + columnName);
        }
    }

    @Test
    public void test2() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi

        ResultSet rs = statement.executeQuery("select*from language");
        ResultSetMetaData rsmd = rs.getMetaData();


        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.print(rsmd.getColumnName(i) + "\t");
        System.out.println();

        while (rs.next())  // bir sonraki
        {
            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.print(rs.getString(i) + "\t" + "\t" + "\t");

            System.out.println();

        }
    }

    @Test
    public void test3() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi

        ResultSet rs = statement.executeQuery("select*from language");
        ResultSetMetaData rsmd = rs.getMetaData();


        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.printf("%-15s", rsmd.getColumnName(i));
        //%    : değişkenin değerini işaret eder.
        //   -  : sola dayalı yazdırır,default sağa dayalı (eksi)
        //20  : kaç tane kullanıclacak her zaman onun bilgisi
        //s  : string değerler için , sayısal değerler için d digit
        //%5.2d  : sayı için 5 hane kullan, ondalıklı kısım 2 haneli

        System.out.println();

        while (rs.next())  // bir sonraki
        {
            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.printf("%-20s", rs.getString(i));

            System.out.println();

        }
    }
    @Test
    public void test4() throws SQLException {
        getTable("select * from actor");

    }
    public void getTable(String sorgu) throws SQLException {

        ResultSet rs = statement.executeQuery(sorgu);
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.printf("%-20s", rsmd.getColumnName(i));

        System.out.println();

        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.printf("%-20s", rs.getString(i));
            System.out.println();
        }
    }

}

