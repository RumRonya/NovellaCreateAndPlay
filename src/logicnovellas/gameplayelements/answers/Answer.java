package logicnovellas.gameplayelements.answers;

import logicnovellas.NovellaGame;
import logicnovellas.gameplayelements.Scene;
import logicnovellas.gameplayelements.dependencies.DependenciesList;
import logicnovellas.gameplayelements.inventory.*;
import playprogressparts.PlayProgress;

import java.util.Map;

public class Answer extends ChangerInventory{
    private int ID_ANSWER;
    private Scene scene;
    private int numAnswer;
    private int nextScene;
    private TypeEnd typeEnd = TypeEnd.NONE;
    private DependenciesList dependenciesList = new DependenciesList();

    public Answer() {
    }

    public int getID_ANSWER() {
        return ID_ANSWER;
    }

    public void setID_ANSWER(int ID_ANSWER) {
        this.ID_ANSWER = ID_ANSWER;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public int getNumAnswer() {
        return numAnswer;
    }

    public void setNumAnswer(int numAnswer) {
        this.numAnswer = numAnswer;
    }

    public int getNextScene() {
        return nextScene;
    }

    public void setNextScene(int nextScene) {
        this.nextScene = nextScene;
    }

    public TypeEnd getTypeEnd() {
        return typeEnd;
    }

    public void setTypeEnd(TypeEnd typeEnd) {
        this.typeEnd = typeEnd;
    }

    public DependenciesList getDependenciesList() {
        return dependenciesList;
    }

    public void setDependenciesList(DependenciesList dependenciesList) {
        this.dependenciesList = dependenciesList;
    }

    public boolean isPlay(PlayProgress playProgress) {
        return dependenciesList.isPlay(playProgress);
    }

    public boolean isFinal(){
        return typeEnd!=TypeEnd.NONE;
    }

}
