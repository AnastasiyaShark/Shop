package Shop;

//Single responsibility Principle
//Работает только с перечислениями и связанными индексами
//для избежания магических чисел
public enum Characteristics {
    TYPE,   //Избегание магических чисел. все константы
    PRICE,  //Используются внутри перечислений
    RATING;


    public static Characteristics fromInt(int index) {
        switch (index) {
            case 0:
                return TYPE;
            case 1:
                return PRICE;
            default:
                return RATING;
        }
    }
}
