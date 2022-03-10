package bai8;

import java.util.ArrayList;
import java.util.List;

public class ManagerCard {
    List<Card> cards;
    public ManagerCard()
    {
        this.cards = new ArrayList<>();
    }
    public void add(Card card)
    {
        this.cards.add(card);
    }
    public void showAll()
    {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
        public boolean deleteCard( String id)
    {
        Card cardtemp =  this.cards.stream().filter(card -> card.getId().equals(id)).findFirst().orElse(null);
        if (cardtemp != null) {
            this.cards.remove(cardtemp);
            return true;
        }
        else{
            return false;
        }
    }

}
