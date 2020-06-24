package Sweets;

public class Candy extends Sweets {
    private String typeSweetness;

    public Candy(String nameSweetness, String tasteOfSweetness, int weightOfSweetnessInGrams, double amountOfSugarSweetnessInGrams, String typeSweetness) {
        super(nameSweetness, tasteOfSweetness, weightOfSweetnessInGrams, amountOfSugarSweetnessInGrams);
        this.typeSweetness = typeSweetness;
    }

    public String getTypeSweetness() {
        return typeSweetness;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}", " typeSweetness='" + typeSweetness + '\'' + '}') ;
    }
}
