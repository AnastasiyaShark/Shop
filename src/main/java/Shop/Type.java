package Shop;

//Single responsibility Principle
//Работает только с перечислениями и связанными индексами
//для избежания магических чисел
public enum Type {
    BOOK(1), //Избегание магических чисел. все константы
    TOY(2);  //Используются внутри перечислений

    private final int index;

    Type(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static Type fromInt(int index) {
        switch (index) {
            case 1:
                return BOOK;
            default:
                return TOY;
        }
    }

}
