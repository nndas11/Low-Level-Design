package solid.o.withSOLID;

public class WithSOLID {
}

// Interface for different salary strategies
interface SalaryStrategy {
    double calculateSalary(double baseSalary);
}

// Concrete strategy for full-time employees
class FullTimeSalary implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary - (baseSalary * 0.1); // 10% tax
    }
}

// Concrete strategy for contract employees
class ContractSalary implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary - (baseSalary * 0.05); // 5% tax
    }
}

// Concrete strategy for interns
class InternSalary implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary; // No deductions
    }
}

// SalaryCalculator now follows OCP, as it doesn't need modification for new salary types
//class SalaryCalculator {
//    public double calculateSalary(Employee employee, SalaryStrategy strategy) {
//        return strategy.calculateSalary(employee.getSalary());
//    }
//}
