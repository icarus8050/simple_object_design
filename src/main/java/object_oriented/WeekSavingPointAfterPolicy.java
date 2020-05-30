package object_oriented;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekSavingPointAfterPolicy extends SavingPointAfterPolicy {

    public WeekSavingPointAfterPolicy(SavingPointPolicy prev) {
        super(prev);
    }

    @Override
    protected Money afterPointProcess(Money totalPrice) {
        if (todayIsWeekend()) {
            return Money.wons(500);
        }

        return Money.ZERO;
    }

    private boolean todayIsWeekend() {
        LocalDate currentDate = LocalDate.now();

        DayOfWeek today = currentDate.getDayOfWeek();

        return today.equals(DayOfWeek.SATURDAY) || today.equals(DayOfWeek.SUNDAY);
    }
}
