package logicnovellas;

import logicnovellas.gameplayelements.Scene;
import users.User;

import java.util.Date;
import java.util.List;



public class NovellaGame {
    private int ID_NOVELLA;
    private User creator;
    private String name;
    private String poster;
    private String description;
    private double rating;
    private int ageRestriction;
    private Duration duration;
    private Date createDate;
    private Date updateDate;
    private List<Scene> scenes;

    public Scene sceneByNum(int i) {
        return new Scene();
    }
}
