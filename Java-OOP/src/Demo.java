import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Product toothbrush = Catalog.getProduct("Electric Toothbrush");
        Product alarm = Catalog.getProduct("Alarm Clock");

        ShoppingCart cart = new ShoppingCart();

        cart.addLineItem(new LineItem(alarm, 1));
        LineItem toothbrushes = new LineItem(toothbrush, 2);
        cart.addLineItem(toothbrushes);

        System.out.println(cart.getTotalCost());

        long ccNumber = 1234567894561234L;
        short expirationMonth = 02;
        short expirationYear = 27;

        Customer customer = new Customer("Kevin Boicourt", ccNumber, expirationMonth, expirationYear);
        Optional<Order> order = customer.checkout(cart);

        System.out.println(order);
    }
}
