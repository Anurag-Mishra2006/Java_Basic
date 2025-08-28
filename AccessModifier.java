class A{
    private
        int a2 = 10;
    protected 
        int a = 9;
        int b = 2006;
}
class B extends A{
        void show(){
            // System.out.println(a2);// this give me error as it doesn't get access to a2

            System.out.println(a);
        }
}

// Private : 
    // Same Class : Yes
    // Same Package : No
    // Same package non-subclass: No
    // Diff package subclass : No
    // Diff package non-subclass : No

// Protected : 
    // Same Class : Yes
    // Same Package : Yes
    // Same package non-subclass: Yes
    // Diff package subclass : Yes
    // Diff package non-subclass : No


// Public : 
    // Same Class : Yes
    // Same Package : Yes
    // Same package non-subclass: Yes
    // Diff package subclass : Yes
    // Diff package non-subclass : Yes


// Default : 
    // Same Class : Yes
    // Same Package : Yes
    // Same package non-subclass: Yes
    // Diff package subclass : No
    // Diff package non-subclass : No


// java has access modifiers 
    // public :  access globally
    // private : access only to same class
    // protected : access to only subclass and same package
    // default : access in the same package

public class AccessModifier {
    public static void main(String arg[]){
        B obj = new B();
        obj.show();

    }
    
}
