package solidPrinciples.interfaceSegregationPrinciple.paymentSystem.badCode;

public class CashPayment implements PaymentProcessor{
    @Override
    public void pay() {
        System.out.println("Cash payment completed.");
    }

    @Override
    public void refund() {
        System.out.println("Cash refund completed.");
    }

    @Override
    public void generateInvoice() {

    }

    @Override
    public void applyCoupon() {

    }

    @Override
    public void validateCard() {

    }
}
