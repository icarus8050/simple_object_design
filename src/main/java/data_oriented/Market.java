package data_oriented;

public class Market {
    public Receipt buy(Product product, Customer customer, int quantity) {
        Money totalFee = product.calculateFee(quantity);
        Money savedPoint = calculateSavedPoint(totalFee, customer);

        return new Receipt(
                customer.getName(),
                product.getName(),
                product.getPrice(),
                quantity,
                totalFee,
                savedPoint
        );
    }

    private Money calculateSavedPoint(Money totalFee, Customer customer) {
        Rank customerRank = customer.getRank();
        if (Rank.PLATINUM.equals(customerRank)) {
            return totalFee.times(0.2);
        } else if (Rank.GOLD.equals(customerRank)) {
            return totalFee.times(0.1);
        } else {
            return totalFee.times(0.05);
        }
    }
}
