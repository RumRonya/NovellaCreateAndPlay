package playprogressparts;

import logicnovellas.NovellaGame;
import logicnovellas.novellaparts.gameelements.Thing;
import logicnovellas.novellaparts.gameplayelements.Scene;
import logicnovellas.novellaparts.gameplayelements.answers.TypeEnd;
import logicnovellas.novellaparts.gameplayelements.dependencies.DependencyDefinable;

import java.util.List;

public class PlayProgress {
    private int ID_USER;
    public NovellaGame novellaGame;
    private List<Thing> inventory;
    private List<Choice> choiceList;
    private CheckPoint checkPoint;

    public boolean isContain(DependencyDefinable dependentObject) {
        if (dependentObject==null) return false;
        if (dependentObject instanceof Choice) return isContainChoice((Choice) dependentObject);
        if (dependentObject instanceof Thing) return  isContainThing((Thing) dependentObject);
        return false;
    }

    private boolean isContainChoice(Choice choice) {
        for (Choice ch: choiceList){
            if (ch.numScene==choice.numScene){
                if (choice.numAnswer==0||ch.numAnswer==choice.numAnswer) return true;
            }
        }
        return false;
    }

    private boolean isContainThing(Thing thing) {
        for (Thing th: inventory){
            if (th.equals(thing)) return true;
        }
        return false;
    }

    public Scene getCurrentScene() {
        return novellaGame.sceneByNum(numCurrentScene());
    }

    private int numCurrentScene() {
        Scene lastScene = novellaGame.sceneByNum(choiceList.getLast().numScene);
        return lastScene.getNumNextSceneByPlayAnswer(choiceList.getLast().numAnswer);
    }

    public Scene gameOver(TypeEnd typeEnd){
        if (typeEnd==TypeEnd.BAD) {
            returnToCheckPoint();
        }
        else {
            choiceList.add(new Choice(0,0));
        }
        return getCurrentScene();
    }
}
