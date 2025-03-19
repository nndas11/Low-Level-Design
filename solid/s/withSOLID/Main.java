package solid.s.withSOLID;

public class Main {
    public static void main(String[] args) {
        System.out.println("hallo");
    }
}

//  Summary
//  Approach	Issues
//  ❌ Without SRP   -> 	Employee class handles salary calculation & file writing.
//  ✅ With SRP	     ->     Employee, SalaryCalculator, and SalaryReport have separate responsibilities.

//Following SRP results in cleaner, modular, and maintainable code. 🚀
