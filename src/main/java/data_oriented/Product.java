package data_oriented;

public class Product {

    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public Money calculateFee(int quantity) {
        return price.times(quantity);
    }

    public Money calculateSavingPoint(Customer customer) {
        Rank customerRank = customer.getRank();

        if (Rank.PLATINUM.equals(customerRank)) {
            return price.times(0.2);
        } else if (Rank.GOLD.equals(customerRank)) {
            return price.times(0.1);
        } else {
            return price.times(0.05);
        }
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
