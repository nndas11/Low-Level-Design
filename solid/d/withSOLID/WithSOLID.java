package solid.d.withSOLID;

public class WithSOLID {
}

// Abstraction (Interface) for payment methods
interface PaymentMethod {
    void pay(int amount);
}

// Low-level module: CreditCardPayment implements PaymentMethod
class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

// Low-level module: PayPalPayment implements PaymentMethod
class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal");
    }
}

// High-level module (depends on abstraction)
class OrderProcessor {
    private PaymentMethod paymentMethod;

    // Constructor injection (Dependency Injection)
    public OrderProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod; // ✅ Inject dependency instead of hardcoding
    }

    public void processOrder(int amount) {
        paymentMethod.pay(amount); // ✅ Uses abstraction (flexible & extendable)
    }
}
