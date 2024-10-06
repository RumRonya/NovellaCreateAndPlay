package logicnovellas.novellaparts.gameplayelements.answers;

import logicnovellas.novellaparts.gameplayelements.dependencies.*;
import logicnovellas.novellaparts.gameplayelements.inventory.ChangerInventory;
import playprogressparts.PlayProgress;

public class Answer extends ChangerInventory implements Dependent {
    private int ID_GAME;
    private int numScene;
    public int numAnswer;
    public int nextScene;
    private TypeEnd typeEnd = TypeEnd.NONE;
    private DependenciesList dependencies;

    @Override
    public boolean isPlay(PlayProgress playProgress, DependenciesList defaultDependencies) {
        return Dependent.super.isPlay(playProgress, dependencies);
    }

    public boolean isFinal(){
        return typeEnd!=TypeEnd.NONE;
    }
}
