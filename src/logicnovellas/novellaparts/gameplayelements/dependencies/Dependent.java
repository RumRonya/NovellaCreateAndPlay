package logicnovellas.novellaparts.gameplayelements.dependencies;

import playprogressparts.PlayProgress;

public interface Dependent {
    public DependenciesList dependenciesList = null;

    public boolean isPlay(PlayProgress playProgress);
}
