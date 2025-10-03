public class Client {
    public static void main(String[] args) {
        Payment p1 = new OnlinePayment(1000.0, "USD", new CreditCard());
        Payment p2 = new OnlinePayment(15000.0, "KZT", new PayPal());
        Payment p3 = new OfflinePayment(0.05, "BTC", new Crypto());

        p1.makePayment();
        p2.makePayment();
        p3.makePayment();
    }
}
