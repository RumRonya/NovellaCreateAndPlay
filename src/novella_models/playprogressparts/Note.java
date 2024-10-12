package novella_models.playprogressparts;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Note {
    private String person;
    private String text;
    private Date date;
    private LocalDateTime dateTime;

    public Note(String person, String text, Date date) {
        this.person = person;
        this.text = text;
        this.date = date;
    }

    public Note(String person, String text) {
        this.person = person;
        this.text = text;
        this.date = new Date();
        int day = date.getDay();
    }
}
