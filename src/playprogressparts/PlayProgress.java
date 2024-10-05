package playprogressparts;

import logicnovellas.novellaparts.gameelements.Thing;
import logicnovellas.novellaparts.gameplayelements.Scene;

import java.util.List;

public class PlayProgress {
    private int ID_USER;
    private int ID_GAME;
    private List<Thing> inventory;
    private List<Choice> choiceList;
    private Scene currentScene;
    private CheckPoint checkPoint;
}
