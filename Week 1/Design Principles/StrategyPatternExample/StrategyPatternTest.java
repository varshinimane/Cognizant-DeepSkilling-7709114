public class StrategyPatternTest {

    public static void main(String[] args) {

        // Pay using Credit Card
        PaymentContext context =
                new PaymentContext(new CreditCardPayment());

        context.executePayment(5000);

        // Change strategy to PayPal
        context.setPaymentStrategy(new PayPalPayment());

        context.executePayment(3000);
    }
}