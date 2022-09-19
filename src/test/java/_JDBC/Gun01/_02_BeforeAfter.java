package _JDBC.Gun01;

import org.testng.annotations.*;

import java.sql.*;

public class _02_BeforeAfter {

    private static Connection connection;
    private static Statement statement;

    @BeforeTest
    public void DBConectionOpen() {
        //baglanti işlemleri
        System.out.println("DB connectin Open");
        System.out.println();
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila"; //hotstname,port,db adını (user db)
        String username = "root"; //username
        String password = "'\"-LhCB'.%k[4S]z"; // password

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement(); //sorguları çalıştırmak için page açıldı.
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void DBConectionClose() {
        //baglanti işlemleri
        try {
            connection.close();
            System.out.println();
            System.out.println("DB connectin Close");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        rs.next();
        String dilAdi=rs.getString("name");
        System.out.println("dilAdi="+dilAdi);

        rs.next();
         dilAdi=rs.getString("name");
        System.out.println("dilAdi="+dilAdi);

        rs.next();
         dilAdi=rs.getString("name");
        System.out.println("dilAdi="+dilAdi);
    }


    @Test
    public void test2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        rs.next();
        String dilAdi=rs.getString(2);
        System.out.println("dilAdi="+dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi="+dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi="+dilAdi);
    }

    @Test
    public void test3() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        rs.next(); // english
        String dilAdi=rs.getString(2);
        System.out.println("dilAdi="+dilAdi);

        rs.next(); // italian
        dilAdi=rs.getString(2);
        System.out.println("dilAdi="+dilAdi);

        rs.previous(); // english, bulunduğu yerden bir önceki satıra gider
        dilAdi=rs.getString(2);
        System.out.println("dilAdi="+dilAdi);
    }
}


