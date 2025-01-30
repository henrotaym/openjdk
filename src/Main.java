import java.util.Optional;

import entities.Card;
import enums.Status;

public class Main {
    public static void main(String[] args) {
        
        Card card = new Card(Optional.of(1), "Faire les courses", Status.TODO);
        System.out.println(card.toString());
    }
}