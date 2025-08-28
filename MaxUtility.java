public class MaxUtility {
    
    public static int maxi(int... numbers){
        int max = numbers[0];
        for(int n: numbers){
            if(n>max)max = n;
        }
        return max;


    }

    // Works with any type that implements Comparable (Integer, Double, Character, String, etc.)
    public static <T extends Comparable<T>> T max(T... values) {
        // extends Comparable<T> → says:
        // I will only allow types that know how to compare themselves with each other.

        T max = values[0];
        for (T val : values) {
            if (val.compareTo(max) > 0) {
                max = val;
            }
        }
        return max;
    }
        
    public static void main(StringLearning []args){
        int []a = {1,2,3,4,5,7,8,9};
        // System.out.println(max(a));

        char []c = {'a','b','c','z'};
        System.out.println((c));
        System.out.println(max(5, 6, 9));          // int → auto-boxed to Integer
        System.out.println(max('a', 'z', 'm'));    // char → auto-boxed to Character
        System.out.println(max(3.14, 2.71, 9.81)); // double → Double
        System.out.println(max("apple", "zebra", "mango")); // String
    

    }
}