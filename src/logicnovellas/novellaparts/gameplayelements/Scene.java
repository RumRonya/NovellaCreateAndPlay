package logicnovellas.novellaparts.gameplayelements;

import logicnovellas.novellaparts.gameplayelements.answers.Answer;
import logicnovellas.novellaparts.gameplayelements.dialogs.Dialog;
import playprogressparts.PlayProgress;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private int ID_NOVELLA;
    private int numScene;
    private String nameScene;
    private String background;
    private List<Dialog> dialogs;
    private List<Answer> answers;

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
}
