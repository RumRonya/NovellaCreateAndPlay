package novella_models.playprogressparts;

import novella_models.logicnovellas.NovellaGame;
import novella_models.logicnovellas.gameplayelements.inventory.Inventory;
import novella_models.logicnovellas.gameplayelements.inventory.Thing;
import novella_models.logicnovellas.gameplayelements.Scene;
import novella_models.logicnovellas.gameplayelements.answers.TypeEnd;
import novella_models.logicnovellas.gameplayelements.dependencies.DependencyDefinable;
import novella_models.users.User;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class PlayProgress {
    private User player;
    public NovellaGame novellaGame;
    public Inventory inventory;
    public List<Choice> choiceList;
    private CheckPoint checkPoint;
    private List<Note> diary;
    private Set<Integer> doneScene;
    private double percentDone;
    private LocalDateTime saveDate;

    public Set<Integer> getDoneScene() {
        return doneScene;
    }

    public void setDoneScene(Set<Integer> doneScene) {
        this.doneScene = doneScene;
    }

    public void addDoneScene(int numScene) {
        doneScene.add(numScene);
        recalculatePercentDone();
    }

    public double getPercentDone() {
        return percentDone;
    }

    public void setPercentDone(double percentDone) {
        this.percentDone = percentDone;
    }

    private void recalculatePercentDone(){
        percentDone = (double) doneScene.size() / (double) novellaGame.getScenes().size() * 100;
    }

    public List<Note> getDiary() {
        return diary;
    }

    public void setDiary(List<Note> diary) {
        this.diary = diary;
    }

    public PlayProgress() {
        recalculatePercentDone();
    }

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
