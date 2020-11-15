package Shop;

//Single responsibility Principle
//Работает только с перечислениями и связанными индексами
//для избежания магических чисел
public enum Rating {
    BADLY,  //Избегание магических чисел. все константы
    OK,     //Используются внутри перечислений
    SUPER;

    public static Rating fromInt(int index) {
        switch (index) {
            case 0:
                return BADLY;
            case 1:
                return OK;
            case 2:
                return SUPER;
            default:
                return OK;
        }
    }
}
