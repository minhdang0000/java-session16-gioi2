package Gioi2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.5));
        products.add(new Product("Chuot", 25.0));
        products.add(new Product("Ban Phim", 80.0));

        ProductProcessor processor = new ProductProcessorImpl();

        if (processor.hasExpensiveProduct(products)) {
            System.out.println("Co san pham > 100");
        } else {
            System.out.println("Khong co san pham dat tien");
        }

        double totalValue = processor.calculateTotalValue(products);
        System.out.println("Tong gia tri san pham: " + totalValue);

        System.out.println("Danh sach san pham:");
        ProductProcessor.printProductList(products);
    }
}
