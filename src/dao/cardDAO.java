package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.DatabaseConfig;
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

    public Card findById(Integer id) throws Exception {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM todos WHERE id = ?");
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();
        resultSet.next();

        return new ResultSetCardFactory(resultSet).createCard();
    }

    public Boolean create(Card card) throws Exception {
        PreparedStatement statement = connection
                .prepareStatement("INSERT INTO todos (title, status, is_done) VALUES (?, ?, ?)");
        statement.setString(1, card.getTitle());
        statement.setString(2, card.getStatus().toString());
        statement.setBoolean(3, card.getIs_done());

        return statement.execute();
    }

    public Boolean save(Card card) throws Exception {
        return card.getId().isPresent() ? this.update(card) : this.create(card);
    }

    public Boolean update(Card card) throws Exception {
        if (card.getId().isEmpty()) {
            throw new IllegalArgumentException("Impossible de mettre à jour une carte sans ID.");
        }

        String query = "UPDATE todos SET title = ?, status = ?, is_done = ? WHERE id = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, card.getTitle());
        statement.setString(2, card.getStatus().toString());
        statement.setBoolean(3, card.getIs_done());
        statement.setInt(4, card.getId().get());

        return statement.executeUpdate() > 0;
    }
}
