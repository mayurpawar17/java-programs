package solidPrinciples.dependencyInversionPrinciple.paymentSystem.goodCode;

public class PaymentSystemMain {
    static void main(String[] args) {
//        Payment payment= new CreditCard();
//        Payment payment = new Upi();
        Payment payment = new NetBanking();

        PaymentService paymentService  = new PaymentService(payment);
        paymentService.processPayment(3000.0);
    }
}
