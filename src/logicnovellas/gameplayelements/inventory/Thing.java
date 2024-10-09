package logicnovellas.gameplayelements.inventory;

import logicnovellas.NovellaGame;
import logicnovellas.gameplayelements.dependencies.DependencyDefinable;

public class Thing implements DependencyDefinable {
    private int ID;
    private NovellaGame novellaGame;
    private String name;
    private String img;
    private boolean isCountable = false;

    public boolean isCountable() {
        return isCountable;
    }

    public void setCountable(boolean countable) {
        isCountable = countable;
    }

    public Thing() {
        novellaGame = new NovellaGame();
        this.name = "AnyThing";
        this.img = "Default.png";
    }

    public Thing(NovellaGame novellaGame, String name) {
        this.novellaGame = novellaGame;
        this.name = name;
        this.img = "Default.png";
    }

    public Thing(NovellaGame novellaGame, String name, String img) {
        this.novellaGame = novellaGame;
        this.name = name;
        this.img = img;
    }

    public Thing(String name, String img, boolean isCountable) {
        this.name = name;
        this.img = img;
        this.isCountable = isCountable;
    }

    public Thing(boolean isCountable, String name) {
        this.isCountable = isCountable;
        this.name = name;
    }

    public NovellaGame getNovellaGame() {
        return novellaGame;
    }

    public void setNovellaGame(NovellaGame novellaGame) {
        this.novellaGame = novellaGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
