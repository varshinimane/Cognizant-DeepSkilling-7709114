public class DecoratorPatternTest {

    public static void main(String[] args) {

        // Email only
        Notifier emailNotifier = new EmailNotifier();

        System.out.println("Email Notification:");
        emailNotifier.send("Meeting at 10 AM");

        System.out.println();

        // Email + SMS
        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        System.out.println("Email + SMS Notification:");
        smsNotifier.send("Meeting at 10 AM");

        System.out.println();

        // Email + SMS + Slack
        Notifier multiNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        System.out.println("Email + SMS + Slack Notification:");
        multiNotifier.send("Meeting at 10 AM");
    }
}