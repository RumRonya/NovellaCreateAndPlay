package logicnovellas.novellaparts.gameplayelements.answers;

import logicnovellas.novellaparts.gameplayelements.dependencies.DependenciesList;
import logicnovellas.novellaparts.gameplayelements.dependencies.Dependent;
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
        return false;
    }
}
