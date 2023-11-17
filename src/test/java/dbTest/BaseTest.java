package dbTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection c = DriverManager.getConnection(DB.connectionString, DB.user, DB.pass);
        Statement statement = c.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from auto");
//        while (resultSet.next())
//            System.out.println(
//                    resultSet.getInt(1) +" "+
//                            resultSet.getString(2)+" "+
//                            resultSet.getString(3)+" "+
//                            resultSet.getString(4));

        List<Automobili> list = new ArrayList<>();
        while (resultSet.next()){
            Automobili automobili = new Automobili();

            automobili.setId(resultSet.getInt("id"));
            automobili.setIdm(resultSet.getInt("idm"));
            automobili.setCena(resultSet.getFloat("cena"));
            automobili.setGodiste(resultSet.getInt("godiste"));

            list.add(automobili);
        }
        list.stream().forEach(automobili -> System.out.println(automobili));
    }


}
