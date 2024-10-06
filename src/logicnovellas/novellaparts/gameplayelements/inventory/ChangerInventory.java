package logicnovellas.novellaparts.gameplayelements.inventory;

import logicnovellas.novellaparts.gameelements.Thing;
import playprogressparts.PlayProgress;

import java.util.Map;

public abstract class ChangerInventory {
    private Map<Thing, ChangeType> changerInventory;

    public ChangerInventory() {}

    public void addChangerInventory(Thing thing, ChangeType changeType) {}

    public void removeChangerInventory(Thing thing) {}

    public void clearChangerInventory() {}

    public void run(PlayProgress playProgress){

    }
}
