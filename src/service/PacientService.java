package service;

import database.DBConnection;
import model.Pacient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PacientService {

    public Pacient createPacient(String alias, String pacientCase, String sessionDay, String hour) {
        String sql = "INSERT INTO pacients (alias, pacientCase, sessionDay, hour) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, alias);
            statement.setString(2, pacientCase);
            statement.setString(3, sessionDay);
            statement.setString(4, hour);


            int modifiedLines = statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Pacient updatePacient() {


    }
}
