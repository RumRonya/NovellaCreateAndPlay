import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import novella_dao.NovellaCreateAndPlayDAO;
import novella_dao.UserDAO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        NovellaCreateAndPlayDAO novellaCreateAndPlayDAO = new NovellaCreateAndPlayDAO();
        novellaCreateAndPlayDAO.createNovellaGame(1, "Banana's life","banana.png","It's story about life of banana in a little store",0);
        novellaCreateAndPlayDAO.closeConnection();
    }
}