package logicnovellas.novellaparts.gameplayelements.dependencies;

import playprogressparts.PlayProgress;

import java.util.List;

public class DependenciesList {
    public List<Dependency> listDependencies;
    public DependencyLogic dependencyLogic;

    public boolean isPlay(PlayProgress playProgress){
        if (listDependencies==null || listDependencies.isEmpty()) return true;
        for (Dependency dependency: listDependencies){
            boolean isShowDependency = dependency.isShow(playProgress);
            if (dependencyLogic == DependencyLogic.OR && isShowDependency) return true;
            if (dependencyLogic == DependencyLogic.AND && !isShowDependency) return false;
        }
        return (dependencyLogic==DependencyLogic.OR) ? false : true;
    }
}
