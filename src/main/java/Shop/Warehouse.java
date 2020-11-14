package Shop;

import java.util.ArrayList;

//S - Single responsibility Principle
//Работает только с массивом продуктов, только фильтрует и возращает список.
public class Warehouse {

    private final Product[] assortment;

    public Warehouse(Product[] assortment) {
        this.assortment = assortment;
    }

    public ArrayList<Product> getAListOfAvailableProducts() {
        ArrayList<Product> availableProducts = new ArrayList<>();
        for (Product product : assortment) {
            if (product.getQuantity() != 0) {
                availableProducts.add(product);
            }
        }
        return availableProducts;
    }


    public ArrayList<Product> getAListByType(Type filterType) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product product : assortment) {
            if (product.getType().equals(filterType)) {
                products.add(product);
            }
        }
        return products;
    }

    public ArrayList<Product> getAListOfPrice(double countPrise) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product product : assortment) {
            if (countPrise > product.getPrice()) {
                products.add(product);
            }
        }
        return products;
    }

    public ArrayList<Product> getAListOfRating(Rating filterRating) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product product : assortment) {
            if (product.getRating().equals(filterRating)) {
                products.add(product);
            }
        }
        return products;
    }
}

