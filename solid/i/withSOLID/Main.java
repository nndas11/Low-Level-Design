package solid.i.withSOLID;

public class Main {
    public static void main(String[] args) {
        Workable emp1 = new FullTimeEmployee();
        Workable emp2 = new PartTimeEmployee();
        Workable robot = new Robot();

        emp1.work();
        emp2.work();
        robot.work();

        Eatable eater = new PartTimeEmployee();
        eater.eat(); // ✅ Works fine

        // Robot does not implement Eatable, so this is not possible (which is good)
        // Eatable robotEater = new Robot(); ❌ Compilation error
    }
}


//✅ Advantages of Following ISP

//  ❌ Without ISP ->	Robot is forced to implement eat() and sleep(), leading to runtime errors.
//  ✅ With ISP	   ->   Each class only implements the interfaces it needs.

//Key Takeaways

//✔ Better Modularity → Interfaces are smaller and easier to manage.
//✔ No Forced Implementations → Classes only implement what they actually need.
//✔ Flexible & Scalable → We can add new interfaces without breaking existing code.

//🚀 By following ISP, we avoid unnecessary dependencies and make our code more maintainable!