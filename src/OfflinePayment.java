class OfflinePayment extends Payment {
    public OfflinePayment(double amount,String currency,PaymentMethod method) {
        super(amount,currency, method);
    }

    @Override
    public void makePayment() {
        System.out.print("Processing offline payment: ");
        method.pay(amount, currency);
    }
}
