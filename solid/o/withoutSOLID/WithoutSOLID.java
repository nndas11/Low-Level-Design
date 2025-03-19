package solid.o.withoutSOLID;

public class WithoutSOLID {
}
//
//  ❌ Problems:
//  If we introduce a new salary type (e.g., "Intern"), we must modify SalaryCalculator, which violates OCP.
//  The class is not scalable; every new salary type requires changes in SalaryCalculator.

//class SalaryCalculator {
//    public double calculateSalary(Employee employee, String type) {
//        if (type.equals("FullTime")) {
//            return employee.getSalary() - (employee.getSalary() * 0.1); // 10% tax
//        } else if (type.equals("Contract")) {
//            return employee.getSalary() - (employee.getSalary() * 0.05); // 5% tax
//        } else {
//            return employee.getSalary(); // No deductions
//        }
//    }
//}
