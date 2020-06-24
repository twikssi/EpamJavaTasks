import java.util.*;

public class Books implements Comparator<Books> {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int years;
    private int countOfPage;
    private double price;
    private String bindingType;

    public int compare (Books one, Books two){
        return one.getAuthor().compareTo(two.getAuthor());
    }

    public Collection<Books> bookSortAuthor (ArrayList<Books> listBooks){
        Books bookCompare = new Books();
        Collections.sort(listBooks,bookCompare);
        return listBooks;
    }

    public Books(){

    }
    public Books(int id, String name, String author, String publishingHouse, int years, int countOfPage, double price, String bindingType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.years = years;
        this.countOfPage = countOfPage;
        this.price = price;
        this.bindingType = bindingType;
    }

    public void getLine(){
        System.out.println("\n Id = " + getId() +
                "\n Имя книги: " + getName() +
                "\n Автор: " + getAuthor() +
                "\n Издательство: " + getPublishingHouse() +
                "\n Год издания: " + getYears() +
                "\n Количество страниц: " + getCountOfPage() +
                String.format("\n Цена: %.2f руб.", getPrice()) +
                "\n Переплет: " + getBindingType());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setCountOfPage(int countOfPage) {
        this.countOfPage = countOfPage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYears() {
        return years;
    }


    public int getCountOfPage() {
        return countOfPage;
    }

    public double getPrice() {
        return price;
    }


    public String getBindingType() {
        return bindingType;
    }

    public String toString (){
        return  "id " + this.id
                + " Имя книги " + this.name
                + " Имя Автора " + this.author
                + " Цена " + this.getPrice()
                + " Переплет " + this.getBindingType()
                + " Издательство " + this.publishingHouse
                + " Год издания " + this.years
                + " Количетсво страниц " + this.countOfPage;
    }

    public static int getCountOverlapEqualArrays (String fieldBase, String inputField ){
        int count = 0;
        String [] fieldBaseArray = fieldBase.toLowerCase().split(" ");
        String [] inputFieldArray = inputField.toLowerCase().trim().split(" ");
        for (int i = 0; i < fieldBaseArray.length; i++) {
            for (int j = 0; j < inputFieldArray.length ; j++){
                        if (fieldBaseArray[i].equals(inputFieldArray[j])) {
                            count = count + 1;
                            break;
                        }
                }
            }
        return count;
    }
}

//class BooksCompare implements Comparator<Books> {
//    public int compare (Books one, Books two){
//        return one.getPublishingHouse().compareTo(two.getPublishingHouse());
//    }
//}
abstract class RandomFields{

    public static String getBindingTypeRandom (){
        String nameBing = "Твердый переплет";
        double randCount = Math.random();
        if ( randCount >= 0.5) {
            nameBing = "Твердый переплет";
        } else {
            nameBing = "Мягкий переплет";
        }
        return nameBing;
    }

    public  static String getPublishingHouseRandom () {
        String namePublishingHouse = "АСТ";
        int randCount = (int) (Math.random() * 4);
        switch (randCount){
            case 0: namePublishingHouse = "АСТ";
                    break;
            case 1: namePublishingHouse = "ПОПУРРИ";
                break;
            case 2: namePublishingHouse = "Эксмо";
                break;
            case 3: namePublishingHouse = "Харвест";
                break;
            case 4: namePublishingHouse = "Питер";
                break;
        }
        return namePublishingHouse;
    }

    public static int getCountOfPageRandom (){
        int countOfPage = 150 + ((int) (Math.random() * 300));
        return countOfPage;
    }
    public static int getYearsRandom(){
        int years = 2000 + ((int) (Math.random() * 20));
        return years;
    }
    public static Double getPriceRandom(){
        double price = 10 + (Math.random() * 25);
        return price;
    }
}