public class Product {
    private final String name;
    private int price;
    private int discount;
    private ProductType type;
    private int weight;

    public Product(String name, int price, ProductType type, int weight) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.weight = weight;
    }

    public int getPrice() {
        int shippingCost = type.getShippingCost(weight);
        return (int)(price * (100 - discount)/100.0) + shippingCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
