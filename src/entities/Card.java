package entities;

import enums.Status;
import java.util.Optional;

public class Card {
    private Optional<Integer> id;
    private String title;
    private Status status;
    private boolean is_done;

    public Card(Optional<Integer> id, String title, Status status, boolean is_done) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.is_done = is_done;
    }

    public Optional<Integer> getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public boolean getIs_done() {
        return is_done;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setIs_done(boolean is_done) {
        this.is_done = is_done;
    }

    @Override
    public String toString() {
        return  id.get()+ " " + title + " " + status;

    }

}
