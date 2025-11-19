public class ArithmeticExc {

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("ERROR: Division with 0");

        }
        return a/b;
    }

    public static void main(String []args){
        System.out.println("Division Operation...");
        try {
            int result = divide(5,0 );
            System.out.println(result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program Ended");
        }
    }
}