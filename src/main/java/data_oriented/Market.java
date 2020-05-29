package data_oriented;

public class Market {
    public Receipt buy(Product product, Customer customer, int quantity) {
        Money totalPrice = product.calculatePrice(quantity);
        Money savedPoint = calculateSavingPoint(customer, totalPrice);
        customer.savePoint(savedPoint);

        return new Receipt(
                customer.getName(),
                product.getName(),
                product.getPrice(),
                quantity,
                totalPrice,
                savedPoint
        );
    }

    private Money calculateSavingPoint(Customer customer, Money totalPrice) {
        Rank customerRank = customer.getRank();

        if (Rank.PLATINUM.equals(customerRank)) {
            return totalPrice.times(0.2);
        } else if (Rank.GOLD.equals(customerRank)) {
            return totalPrice.times(0.1);
        } else {
            return totalPrice.times(0.05);
        }
    }
}