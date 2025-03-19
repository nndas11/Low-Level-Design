package solid.i.withSOLID;

public class WithSOLID {
}

// Separate interfaces for different behaviors
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

// Full-time employees do everything
class FullTimeEmployee implements Workable, Eatable, Sleepable {
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

// Robot only needs Workable interface
class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }
}

// Part-time employees only work and eat
class PartTimeEmployee implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Part-time employee working...");
    }

    @Override
    public void eat() {
        System.out.println("Part-time employee eating...");
    }
}




