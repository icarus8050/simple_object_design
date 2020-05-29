package data_oriented;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    @DisplayName("구매 수량에 대한 총 가격 계산 테스트")
    public void calculateTotalFeeTest() {
        //given
        Product product = new Product("note", Money.wons(1000));
        int quantity = 10;
        Money expectedTotalFee = Money.wons(10000);

        //when
        Money totalFee = product.calculatePrice(quantity);

        //then
        assertTrue(expectedTotalFee.equals(totalFee));
    }

}