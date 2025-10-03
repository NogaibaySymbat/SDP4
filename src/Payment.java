abstract class Payment {
    protected double amount;
    protected String currency;
    protected PaymentMethod method;

    public Payment(double amount,String currency, PaymentMethod method) {
        this.amount = amount;
        this.currency = currency;
        this.method = method;
    }
    public abstract void makePayment();
}
