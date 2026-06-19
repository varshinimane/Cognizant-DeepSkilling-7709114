public class AdapterPatternTest {

    public static void main(String[] args) {

        // PayPal payment
        PaymentProcessor paypalProcessor =
                new PayPalAdapter(new PayPalGateway());

        paypalProcessor.processPayment(1000);

        // Stripe payment
        PaymentProcessor stripeProcessor =
                new StripeAdapter(new StripeGateway());

        stripeProcessor.processPayment(2000);

        // Razorpay payment
        PaymentProcessor razorpayProcessor =
                new RazorpayAdapter(new RazorpayGateway());

        razorpayProcessor.processPayment(3000);
    }
}