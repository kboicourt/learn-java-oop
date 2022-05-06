import com.sun.istack.internal.NotNull;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Optional;

public class Customer {
    private final String name;
    private final CreditCard creditCard;
    private final short expirationMonth;

    public Customer(String name, long ccNumber, short expirationMonth) {
        this.name = name;
        this.expirationMonth = expirationMonth;
        this.creditCard = new CreditCard(ccNumber, expirationMonth);
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
