import com.sun.istack.internal.NotNull;

import java.util.Optional;

public class Customer {
    private final String name;
    private final CreditCard creditCard;
    private final short expirationMonth;
    private final short expirationYear;

    public Customer(String name, long ccNumber, short expirationMonth, short expirationYear) {
        this.name = name;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.creditCard = new CreditCard(ccNumber, expirationMonth, expirationYear);
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
