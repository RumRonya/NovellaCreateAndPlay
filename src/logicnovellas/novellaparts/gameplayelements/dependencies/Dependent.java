package logicnovellas.novellaparts.gameplayelements.dependencies;

import playprogressparts.PlayProgress;

public interface Dependent {
    public default boolean isPlay(PlayProgress playProgress, DependenciesList dependencies){
        if (dependencies==null || dependencies.listDependencies.isEmpty()) return true;
        for (Dependency dependency: dependencies.listDependencies){
            boolean isShowDependency = dependency.isShow(playProgress);
            if (dependencies.dependencyLogic == DependencyLogic.OR && isShowDependency) return true;
            if (dependencies.dependencyLogic == DependencyLogic.AND && !isShowDependency) return false;
        }
        return (dependencies.dependencyLogic==DependencyLogic.OR) ? false : true;
    }
}
