package solid.l.withSOLID;

public class WithSOLID {
}

//  To fix the issue, we should not force Intern to have a getSalary() method.
//  Instead, we should use separate interfaces for salaried employees and interns.

// General interface for all employees
interface Employee {
    String getName();
}

// Interface for employees who receive a salary
interface SalariedEmployee extends Employee {
    double getSalary();
}

// Full-time employees implement SalariedEmployee
class FullTimeEmployee implements SalariedEmployee {
    private String name;
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

// Interns implement only the Employee interface
class Intern implements Employee {
    private String name;

    public Intern(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// A utility class to print salaries (only works with SalariedEmployee)
class SalaryPrinter {
    public static void printSalary(SalariedEmployee employee) {
        System.out.println(employee.getName() + "'s Salary: $" + employee.getSalary());
    }
}

