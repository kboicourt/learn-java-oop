import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private static Map<String, Product> productMap = new HashMap<>();
    public final static int SHIPPING_RATE = 5;

    static {
        productMap.put("Electric Toothbrush", new Product("Electric Toothbrush", 3550, ProductType.PHYSICAL, 100));
        productMap.put("Alarm Clock", new Product("Alarm Clock", 3550, ProductType.PHYSICAL, 300 ));
        productMap.put("Meshuggah", new Product("Meshuggah", 2200, ProductType.DIGITAL, -1 ));
    }

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
