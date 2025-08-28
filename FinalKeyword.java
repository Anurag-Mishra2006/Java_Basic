// final -> class, method, variable

final class Calc{
    public void show(){
        System.out.println("In calc show");

    }
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public final void show2(){
        System.out.println("Finalised.");
    }

}

// final -> stop inheritance.

// class AdvCalc extends Calc{

//      now we cann't use Calc as it is final
//      The type AdvCalc cannot subclass the final class Calc

// }



public class FinalKeyword {  

// the value which will you think that i will not change make it final
//  to protect the code with another unexpected number or value
    public static void main(String a[]){
        final String name  = "Anurag Mishra"; // it is not going to change throughout the code
        // name = "Hello";// ERROR
        System.out.println(name);

        Calc c = new Calc();
        c.show2();
        // c.show();

    }
}
