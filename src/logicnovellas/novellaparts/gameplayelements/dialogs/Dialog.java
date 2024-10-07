package logicnovellas.novellaparts.gameplayelements.dialogs;

import logicnovellas.novellaparts.gameelements.Person;
import logicnovellas.novellaparts.gameplayelements.dependencies.DependenciesList;
import logicnovellas.novellaparts.gameplayelements.inventory.ChangerInventory;
import playprogressparts.PlayProgress;

public class Dialog extends ChangerInventory{
    private int ID_GAME;
    private int numScene;
    private int numDialog;
    private Person person;
    private String imgPerson;
    private Position position;
    private DependenciesList dependencies;

    public boolean isPlay(PlayProgress playProgress) {
        return dependencies.isPlay(playProgress);
    }
}
