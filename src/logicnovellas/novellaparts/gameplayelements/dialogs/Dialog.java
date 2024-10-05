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
    public boolean isPlay(PlayProgress playProgress) {
        if (this.dependencies==null || this.dependencies.listDependencies.isEmpty()) return true;
        for (Dependency dependency: dependencies.listDependencies){
            boolean isShowDependency = dependency.isShow(playProgress);
            if (dependencies.dependencyLogic == DependencyLogic.OR && isShowDependency) return true;
            if (dependencies.dependencyLogic == DependencyLogic.AND && !isShowDependency) return false;
        }
        return (dependencies.dependencyLogic==DependencyLogic.OR) ? false : true;
    }
}
