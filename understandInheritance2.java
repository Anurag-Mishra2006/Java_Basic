public class understandInheritance2 extends understandInheritance{
    
    understandInheritance2(){
        System.out.println("This is inheritated class.");
    }
    
    public 
        int add(int a, int b){return a+b;}
        int sub(int a, int b){return a-b;}

        
    public static void main(String a[]){
        understandInheritance2 obj = new understandInheritance2();
        System.out.println(obj.multi(2,8));
        System.out.println(obj.add(5, 9));
    }
}
