import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(104, "Monitor", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Printer", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics")
        };

        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparingInt(Product::getProductId));

        int searchProductId = 104;

        printResult("Linear Search", SearchOperations.linearSearch(products, searchProductId));
        printResult("Binary Search", SearchOperations.binarySearch(sortedProducts, searchProductId));
    }

    private static void printResult(String title, Product product) {
        System.out.println(title);

        if (product == null) {
            System.out.println("Product not found");
        } else {
            System.out.println(product);
        }

        System.out.println("---------------------------");
    }
}
