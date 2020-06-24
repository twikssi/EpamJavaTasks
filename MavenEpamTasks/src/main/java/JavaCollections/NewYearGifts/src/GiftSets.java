import EnumLollipop.EnumLollipopTypes;
import GiftSets.EnumGiftSets;
import java.util.*;
import Sweets.*;

public class GiftSets{
    private List<? extends Sweets> listSweets ;

    public GiftSets(List<? extends Sweets> listSweets) {
        this.listSweets = listSweets;
    }

    public Sweets getSweetneesWithInputValueOfSugar (List<? extends Sweets> listSweets, double bottomAmountOfsugar, double topAmountOfSugar){
        Sweets sweets = null;
        for (Sweets sweetnees: listSweets) {
            if (sweetnees.getAmountOfSugarSweetnessInGrams() >= bottomAmountOfsugar && sweetnees.getAmountOfSugarSweetnessInGrams() <= topAmountOfSugar){
                sweets = (Sweets) sweetnees;
                break;
            }
        }
        return sweets;
    }

    public int getRandomNumberListSweets (){
        int randomNumberSweets;
        randomNumberSweets = (int) (Math.random() * this.listSweets.size());
        return randomNumberSweets;
    }

    public int getSumWeightSweets(List<? extends Sweets> listSweets){
        int sumWeightSweets = 0;
        if (!listSweets.isEmpty()) {
            for (Sweets sweetnees: listSweets) {
                sumWeightSweets += sweetnees.getWeightOfSweetnessInGrams();
            }
        }
        return sumWeightSweets;
    }

    private int getWeightGift (EnumGiftSets enumGiftSets){
        int weightGift;
        switch (enumGiftSets){
            case LITTLE_SET:
                weightGift = 485;
                break;
            case MEDIUM_SET:
                weightGift = 785;
                break;
            case LARGE_SET:
                weightGift = 985;
                break;
            default:
                weightGift = 0;

        }
        return weightGift;
    }

    public List<Sweets> getGiftLittleOrMediumOrLargeSet(EnumGiftSets enumGiftSet){
        List<Sweets> GiftLittleSet = new ArrayList<>();
        int randomNumberSweetness;
        while (getSumWeightSweets(GiftLittleSet) < getWeightGift(enumGiftSet) && !(this.listSweets.isEmpty())){
            randomNumberSweetness = getRandomNumberListSweets();
            GiftLittleSet.add(this.listSweets.get(randomNumberSweetness));
            this.listSweets.remove(randomNumberSweetness);
        }
        return GiftLittleSet;
    }


    public List<? extends Sweets> getListSweets() {
        return listSweets;
    }


}
