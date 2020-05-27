package data_oriented;

public class Money {

    public static final Money ZERO = Money.wons(0);

    private int amount;

    private Money(int amount) {
        this.amount = amount;
    }

    public static Money wons(int amount) {
        return new Money(amount);
    }

    public Money plus(Money money) {
        return new Money(this.amount + money.amount);
    }

    public Money minus(Money money) {
        return new Money(this.amount - money.amount);
    }

    public Money times(double percent) {
        return new Money((int) (this.amount * percent));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            return false;
        }

        Money other = (Money) obj;
        return this.amount == other.amount;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + amount;
        return result;
    }

    @Override
    public String toString() {
        return String.format("{ amount : %d }", amount);
    }
}
