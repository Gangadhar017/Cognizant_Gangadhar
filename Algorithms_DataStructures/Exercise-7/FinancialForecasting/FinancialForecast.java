public final class FinancialForecast {
    private FinancialForecast() {
    }

    public static double predictFutureValue(double currentValue, double annualGrowthRate, int years) {
        if (years == 0) {
            return currentValue;
        }

        double nextYearValue = currentValue * (1 + annualGrowthRate);
        return predictFutureValue(nextYearValue, annualGrowthRate, years - 1);
    }
}
