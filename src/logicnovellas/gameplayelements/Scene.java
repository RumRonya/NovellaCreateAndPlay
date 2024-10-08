package logicnovellas.gameplayelements;

import logicnovellas.NovellaGame;
import logicnovellas.gameplayelements.answers.Answer;
import logicnovellas.gameplayelements.dialogs.Dialog;
import playprogressparts.PlayProgress;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private int ID_SCENE;
    private NovellaGame novellaGame;
    public int numScene;
    private String nameScene;
    private String background;
    public List<Dialog> dialogs;
    public List<Answer> answers;
    public boolean isCheckPoint;

    public Scene() {
    }

    public Scene(int ID_SCENE, NovellaGame novellaGame, int numScene, String nameScene, String background, List<Dialog> dialogs, List<Answer> answers, boolean isCheckPoint) {
        this.ID_SCENE = ID_SCENE;
        this.novellaGame = novellaGame;
        this.numScene = numScene;
        this.nameScene = nameScene;
        this.background = background;
        this.dialogs = dialogs;
        this.answers = answers;
        this.isCheckPoint = isCheckPoint;
        setSceneForDialogs();
        setSceneForAnswers();
    }

    public int getID_SCENE() {
        return ID_SCENE;
    }

    public void setID_SCENE(int ID_SCENE) {
        this.ID_SCENE = ID_SCENE;
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

    public String getNameScene() {
        return nameScene;
    }

    public void setNameScene(String nameScene) {
        this.nameScene = nameScene;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public List<Dialog> getDialogs() {
        return dialogs;
    }

    public void setDialogs(List<Dialog> dialogs) {
        this.dialogs = dialogs;
        setSceneForDialogs();
    }

    public void addDialog(Dialog dialog) {
        this.dialogs.add(dialog);
        dialog.setScene(this);
    }

    public void addDialogs(List<Dialog> dialogs) {
        this.dialogs.addAll(dialogs);
        setSceneForDialogs();
    }

    private void setSceneForDialogs(){
        for (Dialog dialog : dialogs) {
            dialog.setScene(this);
        }
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
        setSceneForAnswers();
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
        answer.setScene(this);
    }

    public void addAnswer(List<Answer> answers) {
        this.answers.addAll(answers);
        setSceneForAnswers();
    }

    private void setSceneForAnswers(){
        for (Answer answer : answers) {
            answer.setScene(this);
        }
    }

    public boolean isCheckPoint() {
        return isCheckPoint;
    }

    public void setCheckPoint(boolean checkPoint) {
        isCheckPoint = checkPoint;
    }

    public Scene convertToPlayScene(PlayProgress playProgress){
        List<Answer> playAnswers = new ArrayList<>();
        for (Answer answer : answers) {
            if (answer.isPlay(playProgress)) playAnswers.add(answer);
        }
        answers = playAnswers;

        List<Dialog> playDialogs = new ArrayList<>();
        for (Dialog dialog : dialogs) {
            if (dialog.isPlay(playProgress)) playDialogs.add(dialog);
        }
        dialogs = playDialogs;

        return this;
    }

    public int getNumNextSceneByPlayAnswer(int numAnswer) {
        for (Answer answer : answers) {
            if (answer.getNumAnswer() == numAnswer) return answer.getNextScene();
        }
        return 0;
    }

    public Answer getAnswerByNum(int numAnswer) {
        for (Answer answer : answers) {
            if (answer.getNumAnswer() == numAnswer) return answer;
        }
        return null;
    }

}
