package solid.i.withoudSOLID;

public class WithoutSOLID {
}


// Hard to extend → If a new type of worker (e.g., PartTimeEmployee) has different behaviors, we must modify the interface, which violates Open/Closed Principle (OCP) as well.

// Single large interface (bad design)
interface Worker {
    void work();
    void eat();
    void sleep();
}

// Full-time employee works, eats, and sleeps
class FullTimeEmployee implements Worker {
    @Override
    public void work() {
        System.out.println("Full-time employee working...");
    }

    @Override
    public void eat() {
        System.out.println("Full-time employee eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Full-time employee sleeping...");
    }
}

// Robot only works but is forced to implement eat() and sleep()
class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots do not eat!"); // ❌ Violates ISP
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Robots do not sleep!"); // ❌ Violates ISP
    }
}
