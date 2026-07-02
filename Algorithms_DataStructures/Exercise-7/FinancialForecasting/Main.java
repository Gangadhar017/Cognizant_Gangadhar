public class Main {
    public static void main(String[] args) {
        double currentValue = 10000.00;
        double annualGrowthRate = 0.10;
        int years = 5;

        double futureValue = FinancialForecast.predictFutureValue(currentValue, annualGrowthRate, years);

        System.out.printf("Current Value: Rs. %.2f%n", currentValue);
        System.out.printf("Annual Growth Rate: %.2f%%%n", annualGrowthRate * 100);
        System.out.println("Years: " + years);
        System.out.printf("Future Value: Rs. %.2f%n", futureValue);
    }
}
