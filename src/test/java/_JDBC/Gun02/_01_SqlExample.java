package _JDBC.Gun02;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends JDBCParent {
    // last, first, getrow, getInd, getDouble
    @Test
    public void test1() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from city");
        rs.last(); // sonuncu row a gider

        String id=rs.getString(1); // city_id
        System.out.println("id="+id);


        int idInt=rs.getInt(1); //  sayı string olabilir ancak harf int olmaz
        System.out.println("idInt="+idInt);


        String name=rs.getString(2); // city_id
        System.out.println("name="+name);

//        int nameInt=rs.getInt(2);
//        System.out.println("nameInt = " + nameInt);
        // tipi uygun olan dönüşümle , mesala hepsini String olarak alabilirsin.
        // ancak tipi uygun olmayan mesala isimleri , int olarak zaten alınmaz

        int kacinciSatir=rs.getRow();
        // dolayısıyla bir sorgunun sonucunda kaç satır geldiğini
        // rs.last() dedikten sonra rs.getRow() ile alabilirim.


        rs.first(); // ilk satıra gider


    }
}
