package playprogressparts;

import logicnovellas.novellaparts.gameelements.Thing;
import logicnovellas.novellaparts.gameplayelements.Scene;
import logicnovellas.novellaparts.gameplayelements.dependencies.DependencyDefinable;

import java.util.List;

public class PlayProgress {
    private int ID_USER;
    private int ID_GAME;
    private List<Thing> inventory;
    private List<Choice> choiceList;
    private Scene currentScene;
    private CheckPoint checkPoint;

    public boolean isContain(DependencyDefinable dependentObject) {
        return true;
    }
    /*
    * public boolean isHasInProgress(Choice choice) {
        for (Choice ch: choiceList){
            if (ch.getNumScene()==choice.getNumScene()){
                if (choice.getNumAnswer()==0||ch.getNumAnswer()==choice.getNumAnswer())
                    return true;
            }
        }
        return false;
    }
    public boolean isHasInProgress(Thing thing) {
        for (Thing th: pack){
            if (th.equals(thing)){
                return true;
            }
        }
        return false;
    }*/
}
