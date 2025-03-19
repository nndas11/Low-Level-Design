package solid.d.withSOLID;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();

        OrderProcessor order1 = new OrderProcessor(creditCard);
        OrderProcessor order2 = new OrderProcessor(paypal);

        order1.processOrder(100); // ✅ Paid with Credit Card
        order2.processOrder(200); // ✅ Paid with PayPal
    }
}

//✅ Advantages of Following DIP

//  ❌ Without DIP ->	OrderProcessor is tightly coupled to CreditCardPayment, making it hard to extend or test.
//  ✅ With DIP	   ->   OrderProcessor depends on abstraction (PaymentMethod), allowing flexible payment methods.

//  Key Takeaways
//  ✔ Loose Coupling → The high-level module (OrderProcessor) does not depend on concrete implementations.
//  ✔ Open/Closed Principle (OCP) Friendly → We can add new payment methods without modifying OrderProcessor.
//  ✔ Better Testability → We can inject mock implementations for testing.
//
//🚀 By following DIP, we make our system more modular, flexible, and maintainable!