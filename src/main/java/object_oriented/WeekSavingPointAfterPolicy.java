package object_oriented;

import java.time.LocalDate;

public class WeekSavingPointAfterPolicy extends SavingPointAfterPolicy {

    public WeekSavingPointAfterPolicy(SavingPointPolicy prev) {
        super(prev);
    }

    @Override
    Money afterPointProcess(Money totalPrice) {
        if (todayIsWeekend()) {
            return Money.wons(500);
        }

        return Money.ZERO;
    }

    private boolean todayIsWeekend() {
        LocalDate currentDate = LocalDate.now();

        // 1. 월요일, 2. 화요일, ... , 7. 일요일
        int today = currentDate.getDayOfWeek().getValue();

        return today == 6 || today == 7;
    }
}
