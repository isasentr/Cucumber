package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelatives extends JDBCParent {
    @Test
    private void test1() throws SQLException {
        // next() =bir sonraki row
        // previous () = bir önceki row
        // absolute(4)= baştan itibaren 4. row gider. direkt verilen rowa gider
        //  relative (4)=bulunduğu noktadan 4 sonraki Row gider.

        ResultSet rs= statement.executeQuery("select * from film");

        rs.absolute(10); // 10. satıra git
        String title=rs.getString("title");
        System.out.println("title ="+title);


        rs.absolute(15); // 15. satıra git
        title=rs.getString("title");
        System.out.println("title ="+title);

        rs.absolute(-15); // (-) sondan 15. satıra git
         title=rs.getString("title");
        System.out.println("title ="+title);

        rs.relative(5); // en son bulunduğun yerden 5.satır
         title=rs.getString("title");
        System.out.println("title ="+title);

        rs.relative(-5); // en son bulunduğun yerden 5.satır geri gelir
        title=rs.getString("title");
        System.out.println("title ="+title);
    }
}
