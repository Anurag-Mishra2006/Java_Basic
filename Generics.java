// Generics in java enable type-safe and reusable code by allowing you  to specify the data type of object that the class or interface or method work with
// 1. Type Safety 2. Reusablity 3. Compile Time Error Detection 4. NO type Casting
import java.util.*;

public class Generics{
    public static void main(String []args){
        ArrayList<String>names = new ArrayList<String>();
        names.add("Anurag");
        names.add("Khushi");
        names.add("Eshan");
        names.add("Muskan");
        // Sort the array
        Collections.sort(names);
        System.out.println("Sorted Name: ");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}