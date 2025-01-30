import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Optional;

import config.DatabaseConfig;
import dao.cardDAO;
import entities.Card;
import enums.Status;

public class Main {
    public static void main(String[] args) {

        try{
            DatabaseConfig configDB = new DatabaseConfig();

            List<Card> cards = new cardDAO(configDB.getConnection()).findAll();

            for (Card card : cards) {
                System.out.println(card);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}