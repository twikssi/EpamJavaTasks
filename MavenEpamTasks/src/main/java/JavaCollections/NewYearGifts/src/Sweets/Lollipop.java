package Sweets;
import EnumLollipop.EnumLollipopTypes;

public class Lollipop extends Sweets {
    EnumLollipopTypes typeLollipop;


    public Lollipop(String nameSweetness, String tasteOfSweetness, int weightOfSweetnessInGrams, double amountOfSugarSweetnessInGrams, EnumLollipopTypes typeLollipop) {
        super(nameSweetness, tasteOfSweetness, weightOfSweetnessInGrams, amountOfSugarSweetnessInGrams);
        this.typeLollipop = typeLollipop;
    }

    public EnumLollipopTypes getTypeLollipop() {
        return typeLollipop;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}",
                " typeLollipop=" + typeLollipop +
                '}');
    }
}
