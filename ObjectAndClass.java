public class ObjectAndClass {

    public class Calculator {
        public Calculator() {
            System.out.println("Calculator initailzed...");
        }
        int add(int a,int b){ return a+b; }
        int sub(int a, int b){ return a-b; }
        long mul(int a, int b){ return a*b; }
        double div(int a, int b){ return (double)a / b; }  // better: cast to avoid int division
    }

    public static void main(StringLearning arg[]){
        ObjectAndClass outer = new ObjectAndClass();  // ✅ create outer object
        Calculator cal  = outer.new Calculator();     // ✅ create inner object
        int add = cal.add(8,9);
        System.out.println(add);
    }
}
