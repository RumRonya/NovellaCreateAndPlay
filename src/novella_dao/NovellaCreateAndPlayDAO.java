package novella_dao;

import novella_models.users.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NovellaCreateAndPlayDAO {
    private Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/novella_create_and_play", "root", "Ver13deth4");;

    public NovellaCreateAndPlayDAO() throws SQLException {
    }

    public NovellaCreateAndPlayDAO(Connection connection) throws SQLException {
        this.connection = connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public User getUserById(int id) throws SQLException {
        return new UserDAO(connection).findById(id);
    }
}

