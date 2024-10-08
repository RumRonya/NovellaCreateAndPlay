package logicnovellas;

import logicnovellas.gameplayelements.Scene;

import java.util.Date;
import java.util.List;

public class NovellaGame {
    private int ID_NOVELLA;
    private String name;
    private String poster;
    private String description;
    private int rating;
    private int ageRestriction;
    private String duration;
    private Date createDate;
    private Date updateDate;
    private List<Scene> scenes;

    public Scene sceneByNum(int i) {
        return new Scene();
    }
}
