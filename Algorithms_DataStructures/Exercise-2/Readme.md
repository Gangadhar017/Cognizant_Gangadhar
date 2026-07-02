# Exercise 2: E-commerce Platform Search Function

## Objective

This exercise demonstrates how linear search and binary search can be used in an e-commerce product search feature. It also compares both algorithms using Big O notation.

## Scenario

An e-commerce platform stores many products. Customers often search for products by product ID, so the search logic must be correct and efficient.

## Product Details

Each product contains:

- `productId`
- `productName`
- `category`

## Asymptotic Notation

Asymptotic notation describes how an algorithm performs as the input size grows. Big O notation is commonly used to express worst-case time complexity.

| Complexity | Meaning |
| --- | --- |
| O(1) | Constant time |
| O(log n) | Logarithmic time |
| O(n) | Linear time |
| O(n log n) | Linearithmic time |
| O(n^2) | Quadratic time |

## Search Case Analysis

| Case | Linear Search | Binary Search |
| --- | --- | --- |
| Best | O(1), item is first | O(1), item is at the middle |
| Average | O(n), item is around the middle | O(log n), search space is halved |
| Worst | O(n), item is last or missing | O(log n), item is missing or found after repeated halving |

## Project Structure

```text
Algorithms_DataStructures/
  Exercise-2/
    Readme.md
    EcommerceSearch/
      Product.java
      SearchOperations.java
      Main.java
```

## Implementation Summary

Linear search checks each product one by one and works on both sorted and unsorted arrays.

Binary search repeatedly divides the search space in half, so it is faster for large datasets. It requires the product array to be sorted by product ID.

## How to Run

From the `Algorithms_DataStructures/Exercise-2/EcommerceSearch` folder:

```bash
javac *.java
java Main
```

## Expected Output

```text
Linear Search
Product ID: 104
Product Name: Monitor
Category: Electronics
---------------------------
Binary Search
Product ID: 104
Product Name: Monitor
Category: Electronics
---------------------------
Missing Product Search
Product not found
---------------------------
Time Complexity
Linear Search: O(n)
Binary Search: O(log n)
```

## Conclusion

Linear search is simple and works well for small or unsorted datasets. Binary search is more suitable for large product catalogs because it has O(log n) time complexity, but the products must be sorted before searching.
