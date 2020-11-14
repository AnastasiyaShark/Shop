package Shop;

//Liskov Substitution Principle
//Наследуем только для добавления расширения предка полем и переопределением
//(уточнением) метода toString
public class Books extends Product {

    protected String author;

    public Books(Type type, String name, String author, int quantity, double price, Rating rating) {
        super(type, name, quantity, price, rating);
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("name: %s, author: %s, quantity: %d, price: %.2f,rating: %s ", name, author, quantity, price, rating);

    }
}
