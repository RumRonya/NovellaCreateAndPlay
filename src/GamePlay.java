import logicnovellas.NovellaGame;
import logicnovellas.novellaparts.gameplayelements.Scene;
import logicnovellas.novellaparts.gameplayelements.answers.Answer;
import logicnovellas.novellaparts.gameplayelements.dialogs.Dialog;
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
        for (Dialog dialog: currentScene.dialogs){
            dialog.run(playProgress);
        }

        for (Answer answer: currentScene.answers){
            answer.run(playProgress);
        }

        Answer answer = currentScene.getAnswerByNum(numAnswer);
        if (answer.isFinal()){
            currentScene = playProgress.gameOver(answer.typeEnd);
        }
        else {
            int numNextScene = currentScene.getNumNextSceneByPlayAnswer(numAnswer);
            currentScene = novellaGame.sceneByNum(numNextScene);
        }

        if (currentScene.isCheckPoint) {
            updateCheckPoint();
        }
        currentScene = currentScene.convertToPlayScene(playProgress);

        return currentScene;
    }

    private void updateCheckPoint(){
        //realise
    }
}
