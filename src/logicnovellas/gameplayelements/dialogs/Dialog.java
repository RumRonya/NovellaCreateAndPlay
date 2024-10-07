package logicnovellas.gameplayelements.dialogs;

import logicnovellas.gameplayelements.dependencies.DependenciesList;
import logicnovellas.gameplayelements.inventory.ChangerInventory;
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
