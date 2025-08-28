public class StringLearning {
    
    public static void main(String []args){
        
        // there is another special store in heap for string -> string const pool
        // literal does not change.
        
        String name = new String("Anurag Mishra");
        System.out.println(name);
        System.out.println(name.hashCode());

    }
}
