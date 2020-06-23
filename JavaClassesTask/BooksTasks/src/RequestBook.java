import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class RequestBook {
    public static void main (String [] args){
        ArrayList<Books> bookList = new ArrayList<Books>();

        bookList.add (new Books(0,
                "Над пропастью во ржи",
                "Сэллинджер",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(1,
                "Жизнь взаймы",
                "Эрих Мария Ремарк",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(2,
                "Над кукушкиным гнездом",
                "Кен Кизи",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(3,
                "Любовная измена",
                "Лола",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(4,
                "Последний носок",
                "Эдвард Мужчинский",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(5,
                "Легкое дыхание",
                "Бунин",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(6,
                "На западном фронте без перемен",
                "Эрих Мария Ремарк",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(7,
                "Война и мир",
                "Лев Николаевич Толстой",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(8,
                "К востоку от Эдэма",
                "Джон Стейнбэк",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(9,
                "Фиеста",
                "Эрнест Хемингуэй",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        bookList.add (new Books(10,
                "Планет людей",
                "Антуан Де-сент Экзюпери",
                RandomFields.getPublishingHouseRandom(),
                RandomFields.getYearsRandom(),
                RandomFields.getCountOfPageRandom(),
                RandomFields.getPriceRandom(),
                RandomFields.getBindingTypeRandom() ));

        System.out.println("Критерии выбора данных: " +
                "\na)список книг, заданного автора " +
                "\nб)список книг, выпущенных заданным издательством" +
                "\nс)список книг, выпущенных после заданного года ");





        Books bookCompareAuthor = new Books();
        bookCompareAuthor.bookSortAuthor(bookList);

        for (int i = 0; i < bookList.size(); i++){
            bookList.get(i).getLine();
        }


        Scanner in = new Scanner(System.in);
        System.out.println("\na) Введите автора: ");
        String name = in.nextLine();
        int count = 0;
        System.out.println("\nСписок книг: ");

        for (int i = 0; i <bookList.size() ; i++) {
            if (Books.getCountOverlapEqualArrays(bookList.get(i).getAuthor(),name) > 0) {
                bookList.get(i).getLine();
                count++;
            }
        }

        if (count == 0){
            System.out.println("Книг с таким автором нет");
        } else {
            count = 0;
        }

        System.out.println("\nб) Введите издательство: ");
        String namePublishingHouse = in.nextLine();
        System.out.println("\nСписок книг по издательствам: ");

        for (int i = 0; i <bookList.size() ; i++) {
            if (Books.getCountOverlapEqualArrays(bookList.get(i).getPublishingHouse(),namePublishingHouse) > 0) {
                bookList.get(i).getLine();
                count++;
            }
        }

        if (count == 0){
            System.out.println("Книг с таким издательством нет");
        } else {
            count = 0;
        }

        System.out.println("\nс) Введите год издания: ");
        int year = in.nextInt();

            System.out.println("\nСписок книг выпущенных после " + year + " года");

            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getYears() >= year) {
                    bookList.get(i).getLine();
                    count++;
                }
            }
        if (count == 0){
            System.out.println("Книг после " + year + " года нет!");
        } else {
            count = 0;
        }
        }
    }

