package object_oriented;

public class Customer {

    private String name;
    private Rank rank;
    private Money point;

    public Customer(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
        this.point = Money.ZERO;
    }

    public Customer(String name, Rank rank, Money point) {
        this.name = name;
        this.rank = rank;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public boolean isSatisfiedRank(Rank other) {
        return rank.equals(other);
    }

    public void savePoint(Money point) {
        this.point = this.point.plus(point);
    }
}
