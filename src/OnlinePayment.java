class OnlinePayment extends Payment {
    public OnlinePayment(double amount,String currancy,PaymentMethod method) {
        super(amount, currancy, method);
    }

    @Override
    public void makePayment() {
        System.out.print("Processing online payment: ");
        method.pay(amount, currency);
    }
}
