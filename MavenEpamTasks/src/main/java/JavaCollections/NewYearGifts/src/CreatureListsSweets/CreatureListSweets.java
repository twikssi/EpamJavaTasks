package CreatureListsSweets;

import Sweets.*;

import java.util.ArrayList;
import java.util.List;

public class CreatureListSweets {
    private List<? extends Sweets> listSweets ;

    public CreatureListSweets(List<? extends Sweets> listSweets) {
        this.listSweets = listSweets;
    }

    public List<Candy> getCandyList(){
        List<Candy> candyList = new ArrayList<Candy>();
        for (Sweets c: this.listSweets) {
            if (c instanceof Candy){
                candyList.add((Candy) c);
            }
        }
        return candyList;
    }

    public List<Lollipop> getLollipopList(){
        List<Lollipop> lollipopList = new ArrayList<Lollipop>();
        for (Sweets c: this.listSweets) {
            if (c instanceof Lollipop){
                lollipopList.add((Lollipop) c);
            }
        }
        return lollipopList;
    }

    public List<Bubblegum> getBubblegumList(){
        List<Bubblegum> bubblegumList = new ArrayList<Bubblegum>();
        for (Sweets c: this.listSweets) {
            if (c instanceof Bubblegum){
                bubblegumList.add((Bubblegum) c);
            }
        }
        return bubblegumList;
    }
}
