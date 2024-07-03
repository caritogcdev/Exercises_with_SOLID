public class PaymentProcessor implements PaymentMethod{
    private String paymentType;

    public PaymentProcessor(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String processPayment() {
        return paymentType;
    }
}
