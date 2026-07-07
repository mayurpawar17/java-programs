package solidPrinciples.interfaceSegregationPrinciple.paymentSystem.badCode;

public interface PaymentProcessor {
    void pay();

    void refund();

    void generateInvoice();

    void applyCoupon();

    void validateCard();

}
