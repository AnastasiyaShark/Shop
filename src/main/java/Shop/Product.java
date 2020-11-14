package Shop;

//Open Closed Principle
//Поля класса закрыты для изменения и открыты для расширения
//Пример - наследний Books
public class Product {
    protected Type type;
    protected String name;
    protected int quantity;
    protected double price;
    protected Rating rating;

    public Product(Type type, String name, int quantity, double price, Rating rating) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.rating = rating;
    }

    public int getQuantity() {
        return quantity;
    }

    public Type getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("name: %s, quantity: %d, price: %.2f,rating: %s ", name, quantity, price, rating);
    }

    public Rating getRating() {
        return rating;
    }
}
