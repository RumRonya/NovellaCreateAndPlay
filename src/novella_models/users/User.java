package novella_models.users;

import novella_models.logicnovellas.NovellaGame;

import java.util.Date;
import java.util.List;

public class User {
    private int ID_USER;
    private String login;
    private String password;
    private String email;
    private String img;
    private Date birthday;
    private List<NovellaGame> createGames;
    private List<NovellaGame> playGames;
    //lists??
}
