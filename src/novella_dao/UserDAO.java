package novella_dao;

import novella_models.users.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class UserDAO {
    private Connection connection;

    public UserDAO(Connection connection){
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
/*
    public List<User> findAll() throws SQLException {
        ResultSet resultSet = connection.createStatement().executeQuery("select * from users");
        List<User> users = new ArrayList<>();
        while (resultSet.next()){
            users.add(new User(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getDate(5)));
        }
        return users;
    }*/

    public User findById(int id) throws SQLException {
        ResultSet resultSet = connection.createStatement().executeQuery("select * from users where id = " + id);
        User user = null;
        if (resultSet.next()){
            user = new User();
           /* user = new User(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getDate(5));*/
        }
        return user;
    }

    public void createUser(User user) throws SQLException {
        createUser(user.getLogin(), user.getPassword());
    }

    public void createUser(String login, String password) throws SQLException {
        String INSERT_USER = "INSERT INTO `novella_create_and_play`.`users` (`login`, `password`), VALUES (%s, %s)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(format(INSERT_USER, login, password));
    }
}
