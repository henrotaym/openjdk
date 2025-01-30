package factories.entities.card;

import java.sql.ResultSet;
import java.util.Optional;

import entities.Card;
import enums.Status;
import interfaces.factories.CardsFactory;

public class ResulSetCardFactory implements CardsFactory {
    private ResultSet resultSet;

    public Card createCard() throws Exception {
        Integer id = resultSet.getInt("id");
        String title = resultSet.getString("title");
        Status status = Status.valueOf(resultSet.getString("status"));
        boolean is_done = resultSet.getBoolean("is_done");

        return new Card(Optional.of(id), title, status, is_done);
    }
}