package logicnovellas.novellaparts.gameplayelements.answers;

import logicnovellas.novellaparts.gameplayelements.dependencies.*;
import logicnovellas.novellaparts.gameplayelements.inventory.ChangerInventory;
import playprogressparts.PlayProgress;

public class Answer extends ChangerInventory{
    private int ID_GAME;
    private int numScene;
    public int numAnswer;
    public int nextScene;
    public TypeEnd typeEnd = TypeEnd.NONE;
    private DependenciesList dependencies;

    public boolean isPlay(PlayProgress playProgress) {
        return dependencies.isPlay(playProgress);
    }

    public boolean isFinal(){
        return typeEnd!=TypeEnd.NONE;
    }

}
