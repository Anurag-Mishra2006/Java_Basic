public class StaticUnderstanding {
    
    public static class Mobile{
        // these are instance variable.
        String brand;
        int price;
        static String name;
    }
// by static keyword -> static is property of class not obj
//  on changing the value of static variable it reflect in other classes
//  we avoid to call the static variable by class name.
//  We can call the static variable by classname itself, like Mobile.name;

/*
 * Static variables (class variables)
    Shared across all objects of the class.
    Only one copy exists in memory.
 */

 /*
  * Static methods

    Can be called without making an object.
    Cannot access non-static (instance) variables directly.

*/

public static void main(String a[]){
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        obj.name = "SmartPhone";

        System.out.println(obj);

    }
}
