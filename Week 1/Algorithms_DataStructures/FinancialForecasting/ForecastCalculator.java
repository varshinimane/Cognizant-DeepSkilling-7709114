public class ForecastCalculator {

    public static double futureValue(double currentValue,
                                     double growthRate,
                                     int years) {

        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive call
        return futureValue(currentValue,
                           growthRate,
                           years - 1) * (1 + growthRate);
    }
}