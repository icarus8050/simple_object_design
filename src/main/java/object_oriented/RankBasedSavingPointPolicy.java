package object_oriented;

import java.util.Arrays;

public class RankBasedSavingPointPolicy implements SavingPointPolicy {

    @Override
    public Money calculateSavingPoint(Money totalPrice, Customer customer) {

        double savingRate = getCustomerSavingPointRate(customer);

        return totalPrice.times(savingRate);
    }

    private double getCustomerSavingPointRate(Customer customer) {
        return Arrays.stream(Rank.values())
                .filter(customer::isSatisfiedRank)
                .findFirst()
                .orElseThrow(RuntimeException::new)
                .getSavingRate();
    }
}
