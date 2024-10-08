package playprogressparts;

import logicnovellas.gameplayelements.inventory.Inventory;
import logicnovellas.gameplayelements.inventory.Thing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CheckPoint {
    private Inventory inventory;
    private List<Choice> choiceList;

    public CheckPoint() {
        inventory = new Inventory();
        choiceList = new ArrayList<>();
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
