package Sweets;

public class Bubblegum extends Sweets {
    private int countBubblegum;


    public Bubblegum(String nameSweetness, String tasteOfSweetness, int weightOfSweetnessInGrams, double amountOfSugarSweetnessInGrams, int countBubblegum) {
        super(nameSweetness, tasteOfSweetness, weightOfSweetnessInGrams, amountOfSugarSweetnessInGrams);
        this.countBubblegum = countBubblegum;
    }

    public int getCountBubblegum() {
        return countBubblegum;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}"," countBubblegum=" + countBubblegum +
                '}');
    }
}
