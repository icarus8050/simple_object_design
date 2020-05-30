package object_oriented;

import java.time.LocalDateTime;

public class Receipt {

    private final String buyerName;
    private final String productName;
    private final Money price;
    private final int purchaseQuantity;
    private final Money totalPrice;
    private final Money savedPoint;
    private final LocalDateTime purchaseDateTime;

    public Receipt(String buyerName,
                   String productName,
                   Money price,
                   int purchaseQuantity,
                   Money totalPrice,
                   Money savedPoint) {
        this.buyerName = buyerName;
        this.productName = productName;
        this.price = price;
        this.purchaseQuantity = purchaseQuantity;
        this.totalPrice = totalPrice;
        this.savedPoint = savedPoint;
        this.purchaseDateTime = LocalDateTime.now();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getProductName() {
        return productName;
    }

    public Money getPrice() {
        return price;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public Money getTotalPrice() {
        return totalPrice;
    }

    public Money getSavedPoint() {
        return savedPoint;
    }

    public LocalDateTime getPurchaseDateTime() {
        return purchaseDateTime;
    }
}
