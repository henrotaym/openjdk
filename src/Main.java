import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Optional;

import config.DatabbaseConfig;
import entities.Card;
import enums.Status;

public class Main {
    public static void main(String[] args) {

        try{
            DatabbaseConfig configDB = new DatabbaseConfig();
            configDB.getConnection();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}