package Shop;

//Single responsibility Principle
//Работает только с перечислениями и связанными индексами
//для избежания магических чисел
public enum Type {
    BOOK, //Избегание магических чисел. все константы
    TOY;  //Используются внутри перечислений


    public static Type fromInt(int index) {
        switch (index) {
            case 0:
                return BOOK;
            default:
                return TOY;
        }
    }
}
