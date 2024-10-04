package logicnovellas.novellaparts.gameplayelements.dependencies;

public abstract class Dependent {
    private DependenciesList dependenciesList;
    private DependencyLogic dependencyLogic;

    public abstract boolean isPlay(PlayProgress playProgress);
}
