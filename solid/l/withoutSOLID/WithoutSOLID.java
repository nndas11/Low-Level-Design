package solid.l.withoutSOLID;

public class WithoutSOLID {
}

// If we override getSalary() for Intern and return throw new UnsupportedOperationException(), it breaks LSP.

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Interns don’t receive a salary, but we are forced to implement getSalary()
class Intern extends Employee {
    public Intern(String name) {
        super(name, 0); // Interns have no salary
    }

    @Override
    public double getSalary() {
        throw new UnsupportedOperationException("Interns do not receive a salary");
    }
}

//public class LSPViolationDemo {
//    public static void main(String[] args) {
//        Employee emp = new Intern("Alice"); // Violating LSP
//        System.out.println(emp.getSalary()); // ❌ Throws Exception
//    }
//}

