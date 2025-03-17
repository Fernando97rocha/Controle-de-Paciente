package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost/test";
    private static final Properties PROPS = new Properties();

    public static Connection getConnection () {
        PROPS.setProperty("user", "fernando");
        PROPS.setProperty("password", "secret");
        PROPS.setProperty("ssl", "true");
        try {
            return DriverManager.getConnection(URL, PROPS);
        } catch (SQLException e) {
            System.out.println("Erro ao tentar conectar ao banco de dados");
            throw new RuntimeException(e);
        }

    }

    public static void closeConnetion(Connection connection) {

        if (connection != null)
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao tentar encerrar a conexão");
                System.out.println(e.getMessage());
            }


    }
}
