package playprogressparts;

import logicnovellas.gameplayelements.dependencies.DependencyDefinable;

public class Choice implements DependencyDefinable {
    public int numScene;
    public int numAnswer;

    public Choice(int numScene, int numAnswer) {
        this.numScene = numScene;
        this.numAnswer = numAnswer;
    }
}
