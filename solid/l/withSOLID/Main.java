package solid.l.withSOLID;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee emp1 = new FullTimeEmployee("John Doe", 5000);
        Employee emp2 = new Intern("Alice Brown");

        SalaryPrinter.printSalary(emp1); // ✅ Works fine

        // ❌ We no longer pass an Intern to printSalary() (avoiding runtime errors)
        // SalaryPrinter.printSalary(emp2); // Compilation error (which is good)
    }
}


//✅ Advantages of Following LSP

//  ❌ Without LSP	->  Intern throws an exception when calling getSalary(), breaking substitution.
//  ✅ With LSP	    ->  Interns and Salaried Employees follow their own appropriate interfaces.

//  Key Takeaways

//  🚀 Following LSP ensures subclasses can fully replace their base class without breaking functionality.
//  By separating concerns (Employee vs. SalariedEmployee), we avoid forcing a subclass (Intern) to implement irrelevant methods (getSalary()).