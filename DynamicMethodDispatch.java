class A{
    void show(){System.out.println("Class A...");}
}

class B extends A{
    void show(){System.out.println("Class B.");}
}

// Dynamic Method Dispatch : also called Runtime Polymorphism

public class DynamicMethodDispatch {
    public static void main(String []a){
        A o = new A();
        o.show();
        o = new B(); // we are refering the o as obj of class A but technically it's B;
        o.show();

    }
}
// EXTRAs : WHEN YOU STORE THE PREMITIVE TYPE IN THE OBJECT -> BOXING, AND IF AUTOMATICALLY DONE -> AUTOBOXING
//        : WHEN YOU TAKE OUT THE PREMITIVE VALUE FROM THE OBJECT -> AUTO-UNBOXING;
