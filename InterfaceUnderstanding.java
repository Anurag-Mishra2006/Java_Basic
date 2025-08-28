// INTERFACE : It defines a contract that classes must follow.
    //       : An interface can contain abstract methods(methods without a body) and constant
    //       : It's a way to achieve abstraction and multiple inheritance in java
    //       : It promote a design where components are less dependent on each other. Making system easier to maintain and extend


// INTERFACE IS NOT A CLASS. EVERY METHOD IN THE INTERFACE CLASS IS PUBLIC ABSTRACT.
//  so public abstract keywords are not required.

//  Interface cannot be instantiated.
interface  A{

    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("in show of B.");
    }
    public void config(){
        System.out.println("in config of B.");
    }
}

public class InterfaceUnderstanding {
    public static void main(String a[]){

        A obj;
        // obj = new A(); // cann't do this as INTERFACE cannot be instantiated.
        obj = new B();
        obj.show();
        obj.config();
    }
}
