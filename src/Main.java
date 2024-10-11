import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import novella_dao.NovellaCreateAndPlayDAO;
import novella_dao.UserDAO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/novella_create_and_play", "root", "Ver13deth4");
        NovellaCreateAndPlayDAO novellaCreateAndPlayDAO = new NovellaCreateAndPlayDAO();
        novellaCreateAndPlayDAO.closeConnection();

    }
}