import com.sun.istack.internal.NotNull;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Optional;

public class Customer {
    private final String name;
    private final CreditCard creditCard;

    public Customer(String name, long ccNumber) {
        this.name = name;
        this.creditCard = new CreditCard(ccNumber);
    }

    public Optional<Order> checkout(@NotNull ShoppingCart cart) {
        Optional<Payment> payment = creditCard.mkPayment(cart.getTotalCost());
        return payment.map(value -> new Order(this, cart, value));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
