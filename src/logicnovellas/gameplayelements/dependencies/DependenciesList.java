package logicnovellas.gameplayelements.dependencies;

import playprogressparts.PlayProgress;

import java.util.ArrayList;
import java.util.List;

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

public class DependenciesList {
    private List<Dependency> listDependencies;
    private DependencyLogic dependencyLogic;

    public DependenciesList() {
        listDependencies = new ArrayList<Dependency>();
        dependencyLogic = DependencyLogic.OR;
    }

    public DependenciesList(List<Dependency> listDependencies, DependencyLogic dependencyLogic) {
        this.listDependencies = new ArrayList<>(listDependencies);
        this.dependencyLogic = dependencyLogic;
    }

    public List<Dependency> getListDependencies() {
        return listDependencies;
    }

    public void setListDependencies(List<Dependency> listDependencies) {
        this.listDependencies = new ArrayList<>(listDependencies);
    }

    public DependencyLogic getDependencyLogic() {
        return dependencyLogic;
    }

    public void setDependencyLogic(DependencyLogic dependencyLogic) {
        this.dependencyLogic = dependencyLogic;
    }

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
