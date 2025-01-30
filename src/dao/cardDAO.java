package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Card;
import factories.entities.card.ResultSetCardFactory;

public class cardDAO {
    private Connection connection;

    public cardDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Card> findAll() throws Exception {
        List<Card> cards = new ArrayList<Card>();

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM todos");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Card card = new ResultSetCardFactory(resultSet).createCard();
            cards.add(card);
        }

        return cards;

    }
}
