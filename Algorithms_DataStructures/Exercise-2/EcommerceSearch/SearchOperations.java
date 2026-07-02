public final class SearchOperations {
    private SearchOperations() {
    }

    public static Product linearSearch(Product[] products, int productId) {
        if (products == null) {
            return null;
        }

        for (Product product : products) {
            if (product != null && product.getProductId() == productId) {
                return product;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] sortedProducts, int productId) {
        if (sortedProducts == null) {
            return null;
        }

        int low = 0;
        int high = sortedProducts.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currentProductId = sortedProducts[mid].getProductId();

            if (currentProductId == productId) {
                return sortedProducts[mid];
            } else if (currentProductId < productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}
