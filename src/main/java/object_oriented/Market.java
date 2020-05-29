package object_oriented;

public class Market {

    private SavingPointPolicy savingPointPolicy;

    public Market(SavingPointPolicy savingPointPolicy) {
        this.savingPointPolicy = savingPointPolicy;
    }

    public Receipt buy(Product product, Customer customer, int quantity) {
        Money totalPrice = product.calculatePrice(quantity);
        Money savedPoint = calculateSavingPoint(totalPrice, customer);
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

    private Money calculateSavingPoint(Money totalPrice, Customer customer) {
        return savingPointPolicy.calculateSavingPoint(totalPrice, customer);
    }
}
