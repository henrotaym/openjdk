package entities;

import enums.Status;
import java.util.Optional;

public class Card {
    private Optional<Integer> id;
    private String title;
    private Status status;

    public Card(Optional<Integer> id, String title, Status status) {
        this.id = id;
        this.title = title;
        this.status = status;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  id.get()+ " " + title + " " + status;

    }

}
