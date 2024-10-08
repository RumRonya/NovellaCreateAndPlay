import logicnovellas.NovellaGame;
import logicnovellas.gameplayelements.Scene;
import logicnovellas.gameplayelements.answers.Answer;
import logicnovellas.gameplayelements.dialogs.Dialog;
import playprogressparts.Choice;
import playprogressparts.PlayProgress;

public class GamePlay {
    private NovellaGame novellaGame;
    private PlayProgress playProgress;
    private Scene currentScene;

    public GamePlay(PlayProgress playProgress) {
        this.novellaGame = playProgress.novellaGame;
        this.playProgress = playProgress;
        Scene lastScene = playProgress.getCurrentScene();
        this.currentScene = lastScene.convertToPlayScene(playProgress);
    }

    public Scene runCurrentScene(int numAnswer){
        return runCurrentScene(currentScene.getAnswerByNum(numAnswer));
    }

    public Scene runCurrentScene(Answer answer){
        for (Dialog dialog: currentScene.getDialogs()){
            dialog.run(playProgress);
        }

        answer.run(playProgress);

        if (answer.isFinal()){
            currentScene = playProgress.gameOver(answer.getTypeEnd());
        }
        else {
            playProgress.choiceList.add(new Choice(currentScene.getNumScene(), answer.getNumAnswer()));
            int numNextScene = currentScene.getNumNextSceneByPlayAnswer(answer.getNumAnswer());
            currentScene = novellaGame.sceneByNum(numNextScene);
        }

        if (currentScene.isCheckPoint()) {
            playProgress.updateCheckPoint();
        }
        currentScene = currentScene.convertToPlayScene(playProgress);

        return currentScene;
    }

}
