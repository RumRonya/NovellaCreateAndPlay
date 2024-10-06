package logicnovellas.novellaparts.gameplayelements.dialogs;

import logicnovellas.novellaparts.gameelements.Person;
import logicnovellas.novellaparts.gameplayelements.dependencies.DependenciesList;
import logicnovellas.novellaparts.gameplayelements.dependencies.Dependency;
import logicnovellas.novellaparts.gameplayelements.dependencies.DependencyLogic;
import logicnovellas.novellaparts.gameplayelements.dependencies.Dependent;
import logicnovellas.novellaparts.gameplayelements.inventory.ChangerInventory;
import playprogressparts.PlayProgress;

public class Dialog extends ChangerInventory implements Dependent {
    private int ID_GAME;
    private int numScene;
    private int numDialog;
    private Person person;
    private String imgPerson;
    private Position position;
    private DependenciesList dependencies;

    @Override
    public boolean isPlay(PlayProgress playProgress, DependenciesList defaultDependencies) {
        return Dependent.super.isPlay(playProgress, dependencies);
    }
}
