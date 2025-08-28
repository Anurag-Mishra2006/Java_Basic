abstract class Car{
    public abstract void drive();
    
    public void playMusic(){
        System.out.println("Playing music.");
    }
}

class WagnaR extends Car{
    public void drive(){
        System.out.println("Driving WagnaR");
    }
}
public class AbstractUnderstanding {
    
    public static void main(String a[]){
        // Car obj = new Car(); // we cann't create the object of abstract class

        WagnaR obj = new WagnaR();
        obj.drive();
        obj.playMusic();
    }
}
