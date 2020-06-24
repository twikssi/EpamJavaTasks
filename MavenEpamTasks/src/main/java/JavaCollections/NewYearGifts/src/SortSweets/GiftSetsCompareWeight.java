package SortSweets;

import Sweets.Sweets;
import java.util.Comparator;

public class GiftSetsCompareWeight implements Comparator<Sweets> {
    public int compare(Sweets one, Sweets two){
        return one.getWeightOfSweetnessInGrams()-two.getWeightOfSweetnessInGrams();
    }
}
