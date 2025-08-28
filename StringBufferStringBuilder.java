public class StringBufferStringBuilder {
    
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer("Anurag Mishra");
        System.out.println(sb.capacity());// it give me extra buffer space
        sb.append("Mishra");
        System.out.println(sb);
        // string buffer is thread safe while string builder isn't
        

    
    }
}
