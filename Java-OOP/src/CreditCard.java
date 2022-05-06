import java.util.Optional;
import java.util.UUID;

class CreditCard {
    private final long cardNumber;
    private final short expirationMonth;

    public CreditCard(long cardNumber, short expirationMonth) {
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
    }

    public Optional<Payment> mkPayment(int value) {
        if (Math.random() > 0.3) {
            return Optional.of(new Payment(this, value, UUID.randomUUID()));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                '}';
    }
}
