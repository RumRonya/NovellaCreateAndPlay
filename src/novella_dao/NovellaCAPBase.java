package novella_dao;

import novella_models.logicnovellas.NovellaGame;
import novella_models.users.User;

public interface NovellaCAPBase {
    //users
    public void createUser(User user);


    //novellas
    public void createNovella(NovellaGame novella);
}
