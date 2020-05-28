package data_oriented;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    @DisplayName("data_oriented.Money add 테스트")
    public void addMoneyTest() {
        //given
        Money a = Money.wons(1000);
        Money b = Money.wons(1500);
        Money expected = Money.wons(2500);

        //when
        Money c = a.plus(b);

        //then
        assertTrue(expected.equals(c));
        assertNotSame(expected, c);
    }

    @Test
    @DisplayName("data_oriented.Money minus 테스트")
    public void minusMoneyTest() {
        //given
        Money a = Money.wons(10000);
        Money b = Money.wons(3000);
        Money expected = Money.wons(7000);

        //when
        Money c = a.minus(b);

        //then
        assertTrue(expected.equals(c));
        assertNotSame(expected, c);
    }

    @Test
    @DisplayName("data_oriented.Money times 테스트")
    public void timesMoneyTest() {
        //given
        Money a = Money.wons(2000);
        double percent = 0.1; // 10%
        Money expected = Money.wons(200);

        //when
        Money b = a.times(percent);

        //then
        assertTrue(expected.equals(b));
        assertNotSame(expected, b);
    }

    @Test
    @DisplayName("data_oriented.Money times 소수점 버림 테스트")
    public void timesFloorMoneyTest() {
        //given
        Money a = Money.wons(33);
        double percent = 0.3; // 30%
        Money expected = Money.wons(9);

        //when
        Money b = a.times(percent);

        //then
        assertTrue(expected.equals(b));
        assertNotSame(expected, b);
    }
}