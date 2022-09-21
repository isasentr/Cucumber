package _JDBC;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {

    private static Connection connection;
    protected static Statement statement;

    @BeforeTest
    public void DBConnectionOpen() {
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
}
