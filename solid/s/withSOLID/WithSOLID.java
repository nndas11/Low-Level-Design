package solid.s.withSOLID;

public class WithSOLID {
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

// 2. Single Responsibility: Handles salary calculation
class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getSalary() - (employee.getSalary() * 0.1); // Deducting 10% tax
    }
}

// 3. Single Responsibility: Handles file saving
class SalaryReport {
    public void saveSalaryReport(Employee employee, double salary) {

    }
}


