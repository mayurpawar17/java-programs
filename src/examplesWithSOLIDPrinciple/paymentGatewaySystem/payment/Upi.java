package examplesWithSOLIDPrinciple.paymentGatewaySystem.payment;

public class Upi implements Payment ,Refundable{
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment "+amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("UPI Refund "+amount);

    }
}
