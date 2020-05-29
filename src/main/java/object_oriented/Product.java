package object_oriented;

public class Product {

    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public Money calculatePrice(int quantity) {
        return price.times(quantity);
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
