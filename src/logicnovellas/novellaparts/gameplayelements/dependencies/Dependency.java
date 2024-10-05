package logicnovellas.novellaparts.gameplayelements.dependencies;

import playprogressparts.PlayProgress;

public class Dependency {
    private boolean isHas;
    private boolean isShow;
    public DependencyDefinable dependentObject;

    public boolean isShow(PlayProgress playProgress) {
        boolean isInProgress = playProgress.isContain(dependentObject);
        return (isInProgress == isHas) ? isShow : !isShow;
    }
}
