package novella_dao;

import novella_models.users.User;

import java.sql.Connection;
import java.sql.SQLException;

public class NovellaCreateAndPlayDAO {
    private Connection connection;

    public NovellaCreateAndPlayDAO(Connection connection) {
        this.connection = connection;
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

