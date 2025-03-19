package solid.d.withoudSOLID;

public class WithoutSOLID {
}


// OrderProcessor is tightly coupled to CreditCardPayment.
// If we want to add PayPal or UPI payments, we must modify OrderProcessor, breaking OCP.

// Low-level module (specific implementation)
class CreditCardPayment {
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}
// High-level module (depends directly on CreditCardPayment)
class OrderProcessor {
    private CreditCardPayment paymentMethod;

    public OrderProcessor() {
        this.paymentMethod = new CreditCardPayment(); // ❌ Direct dependency on CreditCardPayment
    }

    public void processOrder(int amount) {
        paymentMethod.pay(amount); // ❌ Hardcoded dependency
    }
}