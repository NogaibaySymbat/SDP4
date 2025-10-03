public class PayPal implements PaymentMethod{
    @Override
    public void pay(double amount, String currency) {
        System.out.println("Paid " + amount + " " + currency + " using PayPal");
    }
}
