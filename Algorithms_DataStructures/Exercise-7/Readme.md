# Exercise 7: Financial Forecasting

## Objective

This exercise demonstrates recursion by forecasting the future value of an investment from a current value, an annual growth rate, and a number of years.

## Scenario

A financial forecasting tool predicts future values based on previous growth behavior. The recursive solution applies the growth rate one year at a time until the forecast period is complete.

## Project Structure

```text
Algorithms_DataStructures/
  Exercise-7/
    Readme.md
    FinancialForecasting/
      FinancialForecast.java
      Main.java
```

## Recursion Concept

Recursion is a technique where a method calls itself to solve a smaller version of the same problem.

A recursive method needs:

- A base case that stops recursion.
- A recursive case that reduces the input and calls the method again.

For this exercise, the base case is `years == 0`. The recursive case applies one year of growth and calls the method again with `years - 1`.

## Formula

```text
Future Value = Current Value * (1 + Growth Rate)^Years
```

The recursive implementation calculates this one year at a time:

```java
double nextYearValue = currentValue * (1 + annualGrowthRate);
return predictFutureValueRecursive(nextYearValue, annualGrowthRate, years - 1);
```

## Algorithm

1. Accept the current value, annual growth rate, and number of years.
2. If the number of years is zero, return the current value.
3. Otherwise, calculate the next year's value.
4. Recursively forecast the remaining years.
5. Display the final predicted value.

## Complexity Analysis

| Approach | Time Complexity | Space Complexity | Reason |
| --- | --- | --- | --- |
| Recursive forecast | O(n) | O(n) | One recursive call and one stack frame per year |
| Formula forecast | O(1) | O(1) | Direct calculation using `Math.pow` |

## Optimization

The recursive solution is easy to understand, but very large values of `years` create many stack frames. The optimized formula method avoids repeated recursive calls and is more suitable for very large forecast periods.

## How to Run

From the `Algorithms_DataStructures/Exercise-7/FinancialForecasting` folder:

```bash
javac *.java
java Main
```

## Expected Output

```text
Current Value: Rs. 10000.00
Annual Growth Rate: 10.00%
Years: 5
Recursive Future Value: Rs. 16105.10
Optimized Future Value: Rs. 16105.10
Recursive Time Complexity: O(n)
Optimized Time Complexity: O(1)
```

## Conclusion

The recursive solution demonstrates how a repeated financial calculation can be expressed through a base case and a recursive case. For production-style forecasting with very large periods, the formula-based approach is more efficient because it avoids deep recursion.
