public class MethodOverloading {
    
    public static class Calculator{

        // here method overloading happens-> name same and diff only by parameter.

        public int add(int n1, int n2){return n1+n2;}
        public int add(int n1,int n2, int n3){return n1 + n2+n3;}
    }

    // ** EVERY METHOD HAS ITS OWN STACK
    public static void main(String arg[]){
        Calculator cal = new Calculator();
        System.out.println(cal.add(5,8));
        System.out.println(cal.add(5,8,9));

    }
}
