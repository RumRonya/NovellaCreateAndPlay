package playprogressparts;

import logicnovellas.NovellaGame;
import logicnovellas.gameplayelements.inventory.Inventory;
import logicnovellas.gameplayelements.inventory.Thing;
import logicnovellas.gameplayelements.Scene;
import logicnovellas.gameplayelements.answers.TypeEnd;
import logicnovellas.gameplayelements.dependencies.DependencyDefinable;
import users.User;

import java.util.Date;
import java.util.List;

public class PlayProgress {
    private User player;
    public NovellaGame novellaGame;
    public Inventory inventory;
    public List<Choice> choiceList;
    private CheckPoint checkPoint;
    private Date saveDate;

    public void setCheckPoint(CheckPoint checkPoint) {
        this.checkPoint = checkPoint;
    }

    public boolean isContain(DependencyDefinable dependentObject) {
        if (dependentObject==null) return false;
        if (dependentObject instanceof Choice) return isContainChoice((Choice) dependentObject);
        if (dependentObject instanceof Thing) return  isContainThing((Thing) dependentObject);
        return false;
    }

    private boolean isContainChoice(Choice choice) {
        for (Choice ch: choiceList){
            if (ch.getNumScene()==choice.getNumScene()){
                if (choice.getNumAnswer()==0||ch.getNumAnswer()==choice.getNumAnswer()) return true;
            }
        }
        return false;
    }

    private boolean isContainThing(Thing thing) {
        for (Thing th: inventory.getThings()){
            if (th.equals(thing)) return true;
        }
        return false;
    }

    public Scene getCurrentScene() {
        return novellaGame.sceneByNum(numCurrentScene());
    }

    private int numCurrentScene() {
        Scene lastScene = novellaGame.sceneByNum(choiceList.getLast().getNumScene());
        return lastScene.getNumNextSceneByPlayAnswer(choiceList.getLast().getNumAnswer());
    }

    public Scene gameOver(TypeEnd typeEnd){
        if (typeEnd==TypeEnd.BAD) {
            backToCheckPoint();
        }
        else {
            choiceList.add(new Choice(0,0));
        }
        return getCurrentScene();
    }

    public void addThing(Thing thing) {
        inventory.add(thing);
    }

    public void removeThing(Thing thing) {
        inventory.remove(thing);
    }

    public void updateCheckPoint() {
        checkPoint.setChoiceList(choiceList);
        checkPoint.setInventory(inventory);
    }

    public void backToCheckPoint() {
        choiceList = checkPoint.getChoiceList();
        inventory = checkPoint.getInventory();
    }

    public void clearCheckPoint() {
        checkPoint.clear();
    }
}
