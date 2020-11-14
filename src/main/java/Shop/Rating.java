package Shop;

//Single responsibility Principle
//Работает только с перечислениями и связанными индексами
//для избежания магических чисел
public enum Rating {
    BADLY(1),  //Избегание магических чисел. все константы
    OK(2),     //Используются внутри перечислений
    SUPER(3);

    private final int index;

    Rating(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static Rating fromInt(int index) {
        switch (index) {
            case 1:
                return BADLY;
            case 2:
                return OK;
            case 3:
                return SUPER;
            default:
                return OK;
        }
    }
}
