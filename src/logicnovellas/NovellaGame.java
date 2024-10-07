package logicnovellas;

import logicnovellas.gameplayelements.Scene;

import java.util.Date;

public class NovellaGame {
    private int ID;
    private String name;
    private String poster;
    private String description;
    private int rating;
    private int ageRestriction;
    private String duration;
    private Date createDate;
    private Date updateDate;

    public Scene sceneByNum(int i) {
        return new Scene();
    }
}
