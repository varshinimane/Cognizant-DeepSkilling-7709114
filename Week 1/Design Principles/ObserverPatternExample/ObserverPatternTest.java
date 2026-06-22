public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Alice");
        Observer webUser = new WebApp("Bob");

        // Register observers
        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        // Update stock price
        stockMarket.setStockPrice("TCS", 4200);

        // Deregister one observer
        stockMarket.deregisterObserver(webUser);

        // Update again
        stockMarket.setStockPrice("Infosys", 1800);
    }
}