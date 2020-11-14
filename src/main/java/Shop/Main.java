package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //В общем и целом используется Dependency Inversion Principle
    //Так как мы используем родительский класс Product и списки List<Product>
    public static Product[] generateList() {
        return new Product[]{
                new Books(Type.BOOK, "Harry Potter och Hemligheternas kammare", "J.K Rowling", 3, 1234.3, Rating.SUPER),
                new Toys(Type.TOY, "Lego", 2, 3465.7, Rating.OK),
                new Books(Type.BOOK, "Harry Potter och De Vises Sten", "J.K Rowling", 1, 1500.0, Rating.SUPER),
                new Books(Type.BOOK, "Harry Potter and the Prisoner of Azkaban", "J.K Rowling", 0, 1326.9, Rating.OK),
                new Toys(Type.TOY, "Barbie", 0, 6325.2, Rating.BADLY),
                new Toys(Type.TOY, "Teddy bear", 5, 3654.2, Rating.OK),
        };
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(generateList());
        System.out.println("Список доступных товаров: ");
        printArray(warehouse.getAListOfAvailableProducts());
        filter(warehouse);
    }

    public static void filter(Warehouse warehouse) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" По какому критерию вы хотите отфильтровать товары? (введите номер) %n %d. %s%n %d. %s%n %d. %s%n ",
                Characteristics.TYPE.getIndex(), Characteristics.TYPE,      //Избегание магических чисел. все константы
                Characteristics.PRICE.getIndex(), Characteristics.PRICE,    //Используются внутри перечислений
                Characteristics.RATING.getIndex(), Characteristics.RATING); //
        int count = scanner.nextInt();
        Characteristics chosenChar = Characteristics.fromInt(count);
        switch (chosenChar) {
            case TYPE:
                System.out.printf("Какого типа вывести товары?(введите номер) %n1. %s%n2. %s%n ", Type.BOOK, Type.TOY);
                count = scanner.nextInt();
                Type chosenType = Type.fromInt(count);
                printArray(warehouse.getAListByType(chosenType));
                break;
            case PRICE:
                System.out.println("Введите max стоимость товара:");
                double countPrise = scanner.nextInt();
                printArray(warehouse.getAListOfPrice(countPrise));
                break;
            case RATING:
                System.out.printf(" По какому рейтенгу вы хотите отфильтровать товары? (введите номер) %n %d. %s%n %d. %s%n %d. %s%n",
                        Rating.BADLY.getIndex(), Rating.BADLY,  //Избегание магических чисел. все константы
                        Rating.OK.getIndex(), Rating.OK,        //Используются внутри перечислений
                        Rating.SUPER.getIndex(), Rating.SUPER); //
                count = scanner.nextInt();
                Rating filterRating = Rating.fromInt(count);
                printArray(warehouse.getAListOfRating(filterRating));
                break;
        }
    }

    //DRY , Использую например на строчках: 24 , 41 , 46, 55
    public static void printArray(ArrayList<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
