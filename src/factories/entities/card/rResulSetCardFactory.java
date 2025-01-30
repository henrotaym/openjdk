package factories.entities.card;

import java.sql.ResultSet;

import entities.Card;
import interfaces.factories.CardsFactory;

public class rResulSetCardFactory implements CardsFactory {
    private ResultSet resultSet;

    public Card createCard() throws Exception {
        String id = resultSet.getString("id");
        String title = resultSet.getString("title");
        String status = resultSet.getString("status");
        boolean is_done = resultSet.getBoolean("is_done");

        return new Card(id, title, status, is_done);
}