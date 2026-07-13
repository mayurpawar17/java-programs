package examplesWithSOLIDPrinciple.paymentGatewaySystem.payment;

public class Cash implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Cash Payment " + amount);
    }
}
