package SortSweets;

import Sweets.Sweets;
import java.util.Comparator;

public class GiftSetsCompareNameSweetness implements Comparator<Sweets> {
    public int compare(Sweets one, Sweets two){
        return (one.getNameSweetness().compareTo(two.getNameSweetness()));
    }
}
