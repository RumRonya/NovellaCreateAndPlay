package novella_models.logicnovellas.gameplayelements.dialogs;

import novella_models.logicnovellas.gameplayelements.Scene;
import novella_models.logicnovellas.gameplayelements.dependencies.DependenciesList;
import novella_models.logicnovellas.gameplayelements.inventory.ChangerInventory;
import novella_models.playprogressparts.PlayProgress;

public class Dialog extends ChangerInventory{
    private int ID_DIALOG;
    private Scene scene;
    private int numDialog;
    private Person person;
    private String imgPerson;
    private Position position;
    private DependenciesList dependencies = new DependenciesList();

    public Dialog() {
    }

    public Dialog(int ID_DIALOG, Scene scene, int numDialog) {
        this.ID_DIALOG = ID_DIALOG;
        this.scene = scene;
        this.numDialog = numDialog;
    }

    public Dialog(Scene scene, int numDialog, Person person, String imgPerson, Position position, int ID_DIALOG) {
        this.scene = scene;
        this.numDialog = numDialog;
        this.person = person;
        this.imgPerson = imgPerson;
        this.position = position;
        this.ID_DIALOG = ID_DIALOG;
    }

    public int getID_DIALOG() {
        return ID_DIALOG;
    }

    public void setID_DIALOG(int ID_DIALOG) {
        this.ID_DIALOG = ID_DIALOG;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public int getNumDialog() {
        return numDialog;
    }

    public void setNumDialog(int numDialog) {
        this.numDialog = numDialog;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getImgPerson() {
        return imgPerson;
    }

    public void setImgPerson(String imgPerson) {
        this.imgPerson = imgPerson;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public DependenciesList getDependencies() {
        return dependencies;
    }

    public void setDependencies(DependenciesList dependencies) {
        this.dependencies = dependencies;
    }

    public void setInfoPerson(Person person, String imgPerson, Position position) {
        this.person = person;
        this.imgPerson = imgPerson;
        this.position = position;
    }

    public boolean isPlay(PlayProgress playProgress) {
        return dependencies.isPlay(playProgress);
    }
}
