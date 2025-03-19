package solid.s.withoutSOLID;

public class WithoutSOLID {
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // 1. Business Logic (Calculate Salary)
    public double calculateSalary() {
        return salary - (salary * 0.1); // Deducting 10% tax
    }

    // 2. Save Salary Report (Breaks SRP)
    public void saveSalaryReport() {
    }
}
