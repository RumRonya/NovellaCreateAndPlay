package logicnovellas.novellaparts.gameplayelements;

import logicnovellas.novellaparts.gameplayelements.dependencies.Dependent;
import playprogressparts.PlayProgress;

public class Dialog implements Dependent {
    @Override
    public boolean isPlay(PlayProgress playProgress) {
        return false;
    }
}
