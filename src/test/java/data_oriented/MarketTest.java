package data_oriented;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MarketTest {

    @Test
    @DisplayName("구매 테스트")
    public void purchaseTest() {
        //given
        LocalDateTime currentTime = LocalDateTime.now();
        Market market = new Market();
        Product product = new Product("note", Money.wons(1000));
        Customer customer = new Customer("leafy", Rank.PLATINUM);
        int quantity = 10;

        //when
        Receipt receipt = market.buy(product, customer, quantity);

        //then
        assertEquals("leafy", receipt.getBuyerName());
        assertEquals("note", receipt.getProductName());
        assertEquals(receipt.getPrice(), Money.wons(1000));
        assertEquals(receipt.getPurchaseQuantity(), quantity);
        assertEquals(receipt.getTotalPrice(), Money.wons(10000));
        assertEquals(receipt.getSavedPoint(), Money.wons(2000));
    }

}