package solid.o.withSOLID;

public class Main {
    public static void main(String[] args) {

    }
}


//  Summary

//  Approach	Issues
//  ❌ Without OCP	->  Modifies SalaryCalculator for every new salary type.
//  ✅ With OCP	    ->  Uses SalaryStrategy interface, making it extensible.

//Following OCP makes the system flexible, allowing us to add new behavior without modifying existing code. 🚀