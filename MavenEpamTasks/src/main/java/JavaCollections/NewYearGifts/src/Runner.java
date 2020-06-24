import CreatureListsSweets.CreatureListSweets;
import EnumLollipop.EnumLollipopTypes;
import SortSweets.*;
import Sweets.*;
import GiftSets.EnumGiftSets;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main (String [] args){
    ArrayList<Sweets> sweetList = new ArrayList<Sweets>() {
            {
                this.add(new Lollipop("Chupa-chups","Coca-Cola",30,10,EnumLollipopTypes.STICK));
                this.add(new Lollipop("Chupa-chups","Orange",30,10.5,EnumLollipopTypes.STICK));
                this.add(new Lollipop("Chupa-chups","Apple",30,10,EnumLollipopTypes.WITHOUT_STICK));
                this.add(new Lollipop("Chupa-chups","Strewberry",30,10,EnumLollipopTypes.WITHOUT_STICK));
                this.add(new Lollipop("ChickenLolipop","Pineapple",20,15,EnumLollipopTypes.STICK));
                this.add(new Lollipop("ChickenLollipop","Watermelon",20,15,EnumLollipopTypes.STICK));
                this.add(new Lollipop("littleLollipop","Coca-Cola",10,5,EnumLollipopTypes.WITHOUT_STICK));
                this.add(new Lollipop("littleLollipop","Coca-Cola",10,4,EnumLollipopTypes.WITHOUT_STICK));
                this.add(new Lollipop("littleLollipop","Coca-Cola",10,4,EnumLollipopTypes.WITHOUT_STICK));
                this.add(new Candy("Snickers","Standart",40, 19.7, "chocolate bar"));
                this.add(new Candy("Snickers","2xStandart",80,2*19.7, "chocolate bar"));
                this.add(new Candy("Twikss","Standart",40, 16.6, "chocolate bar"));
                this.add(new Candy("Twikss","2xStandart",80, 2*16.6, "chocolate bar"));
                this.add(new Candy("Nuts","Standart",40, 11.7, "chocolate bar"));
                this.add(new Candy("Nuts","Standart",40, 11.7, "chocolate bar"));
                this.add(new Candy("KitKat","WhiteChocolate",40, 16.4, "chocolate bar"));
                this.add(new Candy("KitKat","GreenTea",40, 16.4, "chocolate bar"));
                this.add(new Candy("KitKat","2xStandart",80, 2*16.4, "chocolate bar"));
                this.add(new Candy("KitKat","Standart",40, 16.4, "chocolate bar"));
                this.add(new Candy("Mars","Standart",40, 16.7, "chocolate bar"));
                this.add(new Candy("Mars","2xStandart",80, 2*16.7, "chocolate bar"));
                this.add(new Bubblegum("Mentos","ice",40,7, 10));
                this.add(new Bubblegum("Mentos","lime",40,7, 10));
                this.add(new Bubblegum("Orbit","ice",25,3, 10));
                this.add(new Bubblegum("Orbit","WithoutSugar",25,0, 10));
                this.add(new Bubblegum("Huba-Buba","Orange",15,7, 10));
                this.add(new Bubblegum("Stimorol","Light",20,7, 10));
                this.add(new Bubblegum("Dirol","Pineapple",25,3, 10));
                this.add(new Bubblegum("Dirol","Apple",25,3, 10));
                this.add(new Bubblegum("Love is","Standart",10,5, 1));
                this.add(new Bubblegum("Huba-Buba","Limon",15,7, 10));
            }
     };
        GiftSets gift = new GiftSets(sweetList);
        List<Sweets> giftLittleSet = gift.getGiftLittleOrMediumOrLargeSet(EnumGiftSets.LITTLE_SET);
        System.out.println("The new year gift is " + gift.getGiftLittleOrMediumOrLargeSet(EnumGiftSets.LITTLE_SET));
        System.out.println("Its weight is " + gift.getSumWeightSweets(giftLittleSet));

        System.out.println("Sort by name sweetnees");
        Collections.sort(giftLittleSet,new GiftSetsCompareNameSweetness());
        System.out.println(giftLittleSet);

        Scanner in = new Scanner(System.in);
        System.out.println("Input bottom amount of sugar press Enter then input top amount of sugar");
        System.out.println(gift.getSweetneesWithInputValueOfSugar(giftLittleSet, in.nextDouble(), in.nextDouble()));

    }
}
