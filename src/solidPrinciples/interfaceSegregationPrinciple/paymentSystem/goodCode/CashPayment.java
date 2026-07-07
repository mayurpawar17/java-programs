package solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode;

import solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode.services.CouponService;
import solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode.services.InvoiceService;
import solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode.services.PaymentService;
import solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode.services.RefundService;

public class CashPayment implements PaymentService, RefundService, InvoiceService, CouponService {
    @Override
    public void pay() {
        System.out.println("Cash Payment");
    }

    @Override
    public void refund() {
        System.out.println("Cash Refund");

    }

    @Override
    public void generateInvoice() {
        System.out.println("Cash Invoice");
    }

    @Override
    public void applyCoupon() {
        System.out.println("Cash Coupon Applied");
    }
}
