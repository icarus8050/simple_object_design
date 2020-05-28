package data_oriented;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    @DisplayName("플레티넘 회원 포인트 적립")
    public void platinumSavingPoint() {
        //given
        Customer customer = new Customer("leafy", Rank.PLATINUM);
        Product product = new Product("note", Money.wons(1000));
        Money expected = Money.wons(200);

        //when
        Money point = product.calculateSavingPoint(customer);   //플레티넘 회원은 20프로 적립

        //then
        assertTrue(expected.equals(point));
    }

    @Test
    @DisplayName("구매 수량에 대한 총 가격 계산 테스트")
    public void calculateTotalFeeTest() {
        //given
        Product product = new Product("note", Money.wons(1000));
        int quantity = 10;
        Money expectedTotalFee = Money.wons(10000);

        //when
        Money totalFee = product.calculateFee(quantity);

        //then
        assertTrue(expectedTotalFee.equals(totalFee));
    }

}