package object_oriented;

public enum Rank {
    PLATINUM(0.2),
    GOLD(0.1),
    SILVER(0.05);

    private double rate;

    Rank(double rate) {
        this.rate = rate;
    }

    public double getSavingRate() {
        return rate;
    }
}
