package dbTest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    public static String dbDriver = "com.mysql.cj.jdbc.Driver";
    public static String connectionString = "jdbc:mysql://localhost:3306/automobili";
    public static String user = "root";
    public static String pass = "root";

    static{
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
