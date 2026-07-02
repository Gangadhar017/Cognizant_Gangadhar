public final class FinancialForecast {
    private FinancialForecast() {
    }

    public static double predictFutureValue(double currentValue, double annualGrowthRate, int years) {
        validateInput(currentValue, annualGrowthRate, years);
        return predictFutureValueRecursive(currentValue, annualGrowthRate, years);
    }

    public static double predictFutureValueFormula(double currentValue, double annualGrowthRate, int years) {
        validateInput(currentValue, annualGrowthRate, years);
        return currentValue * Math.pow(1 + annualGrowthRate, years);
    }

    private static double predictFutureValueRecursive(double currentValue, double annualGrowthRate, int years) {
        if (years == 0) {
            return currentValue;
        }

        double nextYearValue = currentValue * (1 + annualGrowthRate);
        return predictFutureValueRecursive(nextYearValue, annualGrowthRate, years - 1);
    }

    private static void validateInput(double currentValue, double annualGrowthRate, int years) {
        if (currentValue < 0) {
            throw new IllegalArgumentException("Current value cannot be negative.");
        }

        if (annualGrowthRate < -1) {
            throw new IllegalArgumentException("Annual growth rate cannot be less than -100%.");
        }

        if (years < 0) {
            throw new IllegalArgumentException("Years cannot be negative.");
        }
    }
}
