package examplesWithSOLIDPrinciple.paymentGatewaySystem;

import examplesWithSOLIDPrinciple.paymentGatewaySystem.notification.EmailNotification;
import examplesWithSOLIDPrinciple.paymentGatewaySystem.notification.SmsNotification;
import examplesWithSOLIDPrinciple.paymentGatewaySystem.notification.WhatsAppNotification;
import examplesWithSOLIDPrinciple.paymentGatewaySystem.payment.Cash;
import examplesWithSOLIDPrinciple.paymentGatewaySystem.payment.CreditCard;
import examplesWithSOLIDPrinciple.paymentGatewaySystem.payment.Upi;
import examplesWithSOLIDPrinciple.paymentGatewaySystem.services.NotificationProcessor;
import examplesWithSOLIDPrinciple.paymentGatewaySystem.services.PaymentProcessor;

public class PaymentGatewaySystemMain {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor =
                new PaymentProcessor();

        NotificationProcessor notificationProcessor =
                new NotificationProcessor();

        paymentProcessor.processPayment(
                new CreditCard(), 5000);

        paymentProcessor.processPayment(
                new Upi(), 2000);

        paymentProcessor.processPayment(
                new Cash(), 300);

        paymentProcessor.recurringPayment(new CreditCard(),200);

//        paymentProcessor.processPayment(
//                new PayPal(), 4500);

        notificationProcessor.sendNotification(
                new EmailNotification(),
                "Payment Successful");

        notificationProcessor.sendNotification(
                new SmsNotification(),
                "Payment Successful");

        notificationProcessor.sendNotification(
                new WhatsAppNotification(),
                "Payment Successful");

    }
}
