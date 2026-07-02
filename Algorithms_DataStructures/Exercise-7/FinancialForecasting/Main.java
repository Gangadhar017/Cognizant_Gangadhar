public class Main {
    public static void main(String[] args) {
        double currentValue = 10000.00;
        double annualGrowthRate = 0.10;
        int years = 5;

        double recursiveFutureValue = FinancialForecast.predictFutureValue(currentValue, annualGrowthRate, years);
        double optimizedFutureValue = FinancialForecast.predictFutureValueFormula(currentValue, annualGrowthRate, years);

        System.out.printf("Current Value: Rs. %.2f%n", currentValue);
        System.out.printf("Annual Growth Rate: %.2f%%%n", annualGrowthRate * 100);
        System.out.println("Years: " + years);
        System.out.printf("Recursive Future Value: Rs. %.2f%n", recursiveFutureValue);
        System.out.printf("Optimized Future Value: Rs. %.2f%n", optimizedFutureValue);
        System.out.println("Recursive Time Complexity: O(n)");
        System.out.println("Optimized Time Complexity: O(1)");
    }
}
