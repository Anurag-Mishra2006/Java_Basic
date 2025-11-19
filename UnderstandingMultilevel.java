// ================= MULTILEVEL INHERITANCE USING ABSTRACT CLASS =================
//
// ABSTRACT CLASS A:
//  - Can have abstract methods (without body)
//  - Can have normal methods (with body)
//  - Cannot be instantiated
//  - Designed to provide a BASE structure for child classes
//
abstract class A {

    // ABSTRACT METHOD:
    //  - Child classes MUST override this method
    public abstract void fun();

    // NORMAL METHOD:
    //  - Inherited directly by all child classes
    public void funA() {
        System.out.println("I am in class A");
    }
}


// ================= CHILD CLASS B EXTENDING ABSTRACT CLASS A =================
//
// Since B extends A:
//  - B must override the abstract method "fun()"
//  - B automatically inherits funA() without override
//
class B extends A {

    // IMPLEMENTATION OF ABSTRACT METHOD FROM A
    @Override
    public void fun() {
        System.out.println("This method is defined under Class B but it comes from A");
    }

    // CLASS B OWN METHOD
    public void funB() {
        System.out.println("I'm in class B");
    }
}


// ================= MAIN CLASS =================
// Demonstrates multilevel inheritance using abstract class
//
public class UnderstandingMultilevel {
    public static void main(String[] args) {

        System.out.println("Understanding Multilevel Inheritance Using Abstract Class...");

        // Creating object of class B
        // NOTE: You cannot create object of A
        B b = new B();

        // Class B method
        b.funB();

        // Overridden method of A
        b.fun();

        // Inherited normal method of A
        b.funA();
    }
}
