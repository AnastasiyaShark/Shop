package Shop;

//Single responsibility Principle
//Работает только с перечислениями и связанными индексами
//для избежания магических чисел
public enum Characteristics {
    TYPE(1),   //Избегание магических чисел. все константы
    PRICE(2),  //Используются внутри перечислений
    RATING(3);

    private final int index;

    Characteristics(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static Characteristics fromInt(int index) {
        switch (index) {
            case 1:
                return TYPE;
            case 2:
                return PRICE;
            default:
                return RATING;
        }
    }
}
