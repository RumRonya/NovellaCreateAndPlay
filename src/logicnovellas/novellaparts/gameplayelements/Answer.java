package logicnovellas.novellaparts.gameplayelements;

import logicnovellas.novellaparts.gameplayelements.dependencies.Dependent;

public class Answer extends Dependent {
    @Override
    public boolean isPlay(PlayProgress playProgress) {
        return false;
    }
}
