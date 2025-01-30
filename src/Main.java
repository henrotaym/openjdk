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
            DatabaseConfig connectionDB = new DatabaseConfig();

            cardDAO cardDao = new cardDAO(connectionDB.getConnection());

            
            System.out.println("Ajout à la db");

           /*  Card card1 = new Card(Optional.empty(),"Faire les courses", Status.TODO, false);
            cardDao.save(card1); */

            
            List<Card> cards = cardDao.findAll();

            for (Card card : cards) {
                System.out.println(card);
            }

            Card card = new cardDAO(connectionDB.getConnection()).findById(1);
            System.out.println(card);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}