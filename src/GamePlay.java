import logicnovellas.NovellaGame;
import logicnovellas.novellaparts.gameplayelements.Scene;
import playprogressparts.PlayProgress;

public class GamePlay {
    private NovellaGame novellaGame;
    private PlayProgress playProgress;
    private Scene currentScene;

    public GamePlay(PlayProgress playProgress) {
        this.novellaGame = playProgress.novellaGame;
        this.playProgress = playProgress;
        this.currentScene = novellaGame.sceneByNum(playProgress.numCurrentScene()).convertToPlayScene(playProgress);
    }

}
