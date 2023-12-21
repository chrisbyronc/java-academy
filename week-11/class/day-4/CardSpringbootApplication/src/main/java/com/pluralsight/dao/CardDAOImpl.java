package com.pluralsight.dao;

import com.pluralsight.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.Random;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CardDAOImpl implements CardDAO {

    private DataSource dataSource;

    @Autowired
    public CardDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public List<Card> drawAllCards() {
        List<Card> cards = new ArrayList<>();

        String sql = "SELECT * FROM Cards;";
        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                cards.add(new Card(
                        rows.getString("name"),
                        rows.getString("suit"),
                        rows.getInt("value")
                ));
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }

        return cards;
    }

    @Override
    public Card drawCard() {
        String sql = "SELECT * FROM Cards WHERE id = " + new Random().nextInt(cardCount()) + 1;

        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                return new Card(
                        rows.getString("name"),
                        rows.getString("suit"),
                        rows.getInt("value")
                );
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }

        return null;
    }

    @Override
    public Card updateCard(int id, Card card) {
        String sql = "UPDATE Cards SET suit = ?, value = ?, name = ? WHERE id = ?";

        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, card.getSuit());
            statement.setInt(2, card.getValue());
            statement.setString(3, card.getName());
            statement.setInt(4, id);
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                return new Card(
                        rows.getString("name"),
                        rows.getString("suit"),
                        rows.getInt("value")
                );
            }
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public boolean deleteCard(int id) {
        String sql = "DELETE FROM Cards WHERE id = ?";

        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                return true;
            }
        }
        catch (SQLException e){
            System.out.println(e);
            return false;
        }

        return false;
    }




    public int cardCount() {
        String sql = "SELECT COUNT(*) FROM Cards";

        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                return rows.getInt(1);
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return 0;
    }
}
