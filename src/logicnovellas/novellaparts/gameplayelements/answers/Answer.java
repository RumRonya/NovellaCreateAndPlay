package logicnovellas.novellaparts.gameplayelements.answers;

import logicnovellas.novellaparts.gameplayelements.dependencies.*;
import logicnovellas.novellaparts.gameplayelements.inventory.ChangerInventory;
import playprogressparts.PlayProgress;

public class Answer extends ChangerInventory implements Dependent {
    private int ID_GAME;
    private int numScene;
    private int numAnswer;
    private int nextScene;
    private TypeEnd typeEnd = TypeEnd.NONE;
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
