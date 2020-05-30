package object_oriented;

public abstract class SavingPointAfterPolicy implements SavingPointPolicy {

    private SavingPointPolicy prev;

    public SavingPointAfterPolicy(SavingPointPolicy prev) {
        this.prev = prev;
    }

    @Override
    public Money calculateSavingPoint(Money totalPrice, Customer customer) {
        Money point = prev.calculateSavingPoint(totalPrice, customer);
        Money afterAddedPoint = afterPointProcess(totalPrice);

        return point.plus(afterAddedPoint);
    }

    abstract Money afterPointProcess(Money totalPrice);
}
