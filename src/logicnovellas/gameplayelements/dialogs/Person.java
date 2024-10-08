package logicnovellas.gameplayelements.dialogs;

import logicnovellas.NovellaGame;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private NovellaGame novellaGame;
    private String name;
    private List<String> listImages;

    public Person(NovellaGame novellaGame, String name, List<String> listImages) {
        this.novellaGame = novellaGame;
        this.name = name;
        this.listImages = listImages;
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

    public List<String> getListImages() {
        return listImages;
    }

    public void setListImages(List<String> listImages) {
        this.listImages = listImages;
        deleteDuplicate();
    }

    public String getUrlImageByNum(int num) {
        return listImages.get(num);
    }

    public void addImage(String image) {
        listImages.add(image);
        deleteDuplicate();
    }

    public void addImages(List<String> images) {
        listImages.addAll(images);
        deleteDuplicate();
    }

    public void removeImage(String image) {
        listImages.remove(image);
    }

    public void clearImages() {
        listImages.clear();
    }

    private void deleteDuplicate(){
        List<String> listImagesWithoutDuplicate = new ArrayList<String>();
        for (String image: listImages) {
            if (!listImagesWithoutDuplicate.contains(image)) {
                listImagesWithoutDuplicate.add(image);
            }
        }
        listImages = listImagesWithoutDuplicate;
    }
}
