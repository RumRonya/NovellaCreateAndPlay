package playprogressparts;

import logicnovellas.NovellaGame;
import logicnovellas.gameplayelements.inventory.Inventory;
import logicnovellas.gameplayelements.inventory.Thing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckPoint {
    private int ID;
    private PlayProgress progress;
    private Inventory inventory;
    private List<Choice> choiceList;
    private Date saveDate;

    public CheckPoint(PlayProgress playProgress) {
        playProgress.setCheckPoint(this);
        inventory = playProgress.inventory;
        choiceList = playProgress.choiceList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Choice> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<Choice> choiceList) {
        this.choiceList = choiceList;
    }

    public void clear() {
        this.inventory = new Inventory();
        this.choiceList = new ArrayList<>();
    }
}
