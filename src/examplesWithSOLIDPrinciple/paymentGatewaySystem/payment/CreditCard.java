package examplesWithSOLIDPrinciple.paymentGatewaySystem.payment;

public class CreditCard implements Refundable, Payment, RecurringPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment "+amount);
    }

    @Override
    public void recurringPayment(double amount) {
        System.out.println("Credit Card Recurring Payment "+amount);

    }

    @Override
    public void refund(double amount) {
        System.out.println("Credit Card refund Payment "+amount);

    }
}
