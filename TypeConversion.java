public class TypeConversion {
    
    public static void main(StringLearning []args){
        // size of byte data type is 1 byte 
        // byte store upto 127;

        int a = 256;
        byte b = 127;
        a = b;// type conversion b->a
        // b = a;// Conversion from int to byte-> give error

        // for conversion we do explicit type casting
        // (datatype)

        a = b;
        System.out.println(a);

        float f = 5.60f;
        int x = (int)f;
        System.out.println(x);

        // when we are trying to asign the larger data type to lower one
        byte d = 127;
        int p = 257;

        d  = (byte)p; // this is threaded as 257% 256 --> the complete range of byte is -128 to 127
        System.out.println(d); // 257 % 256 == 1
        
    }
}
