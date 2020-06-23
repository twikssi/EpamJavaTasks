package Sweets;

public class Sweets {
    private String nameSweetness;
    private String tasteOfSweetness;
    private int weightOfSweetnessInGrams;
    private double amountOfSugarSweetnessInGrams;

    public Sweets(String nameSweetness, String tasteOfSweetness, int weightOfSweetnessInGrams, double amountOfSugarSweetnessInGrams) {
        this.nameSweetness = nameSweetness;
        this.tasteOfSweetness = tasteOfSweetness;
        this.weightOfSweetnessInGrams = weightOfSweetnessInGrams;
        this.amountOfSugarSweetnessInGrams = amountOfSugarSweetnessInGrams;
    }

    public String getNameSweetness() {
        return nameSweetness;
    }

    public String getTasteOfSweetness() {
        return tasteOfSweetness;
    }

    public int getWeightOfSweetnessInGrams() {
        return weightOfSweetnessInGrams;
    }

    public double getAmountOfSugarSweetnessInGrams() {
        return amountOfSugarSweetnessInGrams;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "nameSweetness='" + nameSweetness + '\'' +
                ", tasteOfSweetness='" + tasteOfSweetness + '\'' +
                ", weightOfSweetnessInGrams=" + weightOfSweetnessInGrams +
                ", amountOfSugarSweetnessInGrams=" + amountOfSugarSweetnessInGrams +
                '}';
    }
}
