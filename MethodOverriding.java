class A{
    public void show(){
        System.out.println("in A show.");
    }
    public void config(){
        System.out.println("in A's config. ");
    }
}

class B extends A {
    public void show(){
        System.out.println("B override the A's show");
    }
    
}
// In method overloading -> same name diff parameter
// In method overriding  -> same name and same parameter



public class MethodOverriding {
    
    public static void main(String a[]){
        B obj = new B();
        obj.show();
        obj.config();
    }
}
