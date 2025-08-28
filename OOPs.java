public class OOPs {
    //  four pillars : inheritance, encapsulation, abstraction, polymorphism

    // Inheritance : For code reusability feature : Inheritance the properties of parent class
        // Inheritance follow 'is relation'
    
    // Encapsulation : Binding of member data and member fxn
    // Abstraction  : Hiding of unneccessary data or implementation part
    // Polymorphism(Poly-> many, morphism -> form) : Performing multiple functionality using single name
    
    static class Human{
        private
            String name;
            int age;
        public
            void setname(String n){
                this.name = n;
            }
            void setage(int a){
                this.age = a;
            }
            Human(){
                System.out.println("Constructor is called...");
            }

            Human(String name, int age){
                this.name = name;
                this.age = age;
            }
            public int getAge() {
                return age;
            }
            public String getName() {
                return name;
            }
            
    }
    public static void main(String a[]){
        Human h = new Human();
        h.setage(50);
        h.setname("Eshan Pandey");
        Human w = new Human("Anu Bhai", 2);
        System.out.println(h.getName());
        System.out.println(w.getName());
    }
}
