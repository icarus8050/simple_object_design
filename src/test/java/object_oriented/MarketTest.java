package object_oriented;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketTest {

    @Test
    @DisplayName("등급별 포인트 적립")
    public void rankBasedSavePointTest() {
        //given
        Customer customer = new Customer("leafy", Rank.PLATINUM);
        Product product = new Product("고무오리", Money.wons(1000));
        Market market = new Market(new RankBasedSavingPointPolicy());

        //when
        Receipt receipt = market.buy(product, customer, 10);

        //then
        assertEquals(Money.wons(2000), receipt.getSavedPoint());
    }

    @Test
    @DisplayName("추가 포인트 적립 테스트")
    public void afterProcessTest() {
        //given
        Customer customer = new Customer("leafy", Rank.PLATINUM);
        Product product = new Product("고무오리", Money.wons(1000));
        Market market = new Market(
                new WeekSavingPointAfterPolicy(
                        new RankBasedSavingPointPolicy()
                )
        );

        //when
        Receipt receipt = market.buy(product, customer, 10);

        //then
        assertEquals(Money.wons(2500), receipt.getSavedPoint());
    }
}