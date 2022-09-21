package Utilities;

import org.testng.annotations.BeforeTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {

    private static Connection connection;
    protected static Statement statement;


    private static void DBConnectionOpen() {
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
    public static void DBConnectionClose() {
        //baglanti işlemleri
        try {
            connection.close();
            System.out.println();
            System.out.println("DB connectin Close");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {  // test main
        List<List<String>> tablo=getListData("select * from actor");

        for(List<String> satir : tablo) // tes için kontrol , veriler geldi mi, liste atıldı mı
            System.out.println("satir = " + satir);
    }

    public static List<List<String>> getListData(String sorgu) {
        List<List<String>> tablo = new ArrayList<>();
        // db den bütün satırları ve sütunları okuyup bu listeye atacağım.

        // db den bağlantı aç.
        DBConnectionOpen();

        try {
            ResultSet rs = statement.executeQuery(sorgu);
            // 2. bütün satırları ve o satırlardaki sütunları oku tabloya ekle
            int columnSayisi = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                List<String> satir = new ArrayList<>();
                for (int i = 1; i <= columnSayisi; i++) {
                    satir.add(rs.getString(i));
                }
                tablo.add(satir);
            }
        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
        DBConnectionClose();
        //db bağlantısını kapat
        return tablo;
    }
}
