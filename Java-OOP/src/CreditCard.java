import java.util.Optional;
import java.util.UUID;

class CreditCard {
    private final long cardNumber;
    private final short expirationMonth;
    private final short expirationYear;

    public CreditCard(long cardNumber, short expirationMonth, short expirationYear) {
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
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
