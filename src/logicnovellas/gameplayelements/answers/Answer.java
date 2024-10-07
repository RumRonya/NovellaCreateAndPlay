package logicnovellas.gameplayelements.answers;

import logicnovellas.NovellaGame;
import logicnovellas.gameplayelements.dependencies.DependenciesList;
import logicnovellas.gameplayelements.inventory.*;
import playprogressparts.PlayProgress;

import java.util.Map;

public class Answer extends ChangerInventory{
    private NovellaGame novellaGame;
    private int numScene;
    private int numAnswer;
    private int nextScene;
    private TypeEnd typeEnd = TypeEnd.NONE;
    private DependenciesList dependenciesList = new DependenciesList();

    public Answer() {
    }

    public Answer(Map<Thing, ChangeType> changerInventory, NovellaGame novellaGame, int numScene, int numAnswer, int nextScene, TypeEnd typeEnd, DependenciesList dependenciesList) {
        super(changerInventory);
        this.novellaGame = novellaGame;
        this.numScene = numScene;
        this.numAnswer = numAnswer;
        this.nextScene = nextScene;
        this.typeEnd = typeEnd;
        this.dependenciesList = dependenciesList;
    }

    public Answer(int numScene, int nextScene, int numAnswer, TypeEnd typeEnd) {
        this.numScene = numScene;
        this.nextScene = nextScene;
        this.numAnswer = numAnswer;
        this.typeEnd = typeEnd;
    }

    public Answer(int numScene, int nextScene, int numAnswer) {
        this.numScene = numScene;
        this.nextScene = nextScene;
        this.numAnswer = numAnswer;
    }

    public NovellaGame getNovellaGame() {
        return novellaGame;
    }

    public void setNovellaGame(NovellaGame novellaGame) {
        this.novellaGame = novellaGame;
    }

    public int getNumScene() {
        return numScene;
    }

    public void setNumScene(int numScene) {
        this.numScene = numScene;
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
