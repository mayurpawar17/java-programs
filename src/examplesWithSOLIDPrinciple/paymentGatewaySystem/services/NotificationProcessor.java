package examplesWithSOLIDPrinciple.paymentGatewaySystem.services;

import examplesWithSOLIDPrinciple.paymentGatewaySystem.notification.Notification;

public class NotificationProcessor {

    public void sendNotification(
            Notification notification,
            String message) {

        notification.send(message);

    }
}
