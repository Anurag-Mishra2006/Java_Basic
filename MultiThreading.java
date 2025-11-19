class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 4; i++){
            System.out.println(Thread.currentThread().getName() +  "- " + i);
        }
    try{

        Thread.sleep(5000);

    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}

public class MultiThreading{
    public static void main(String []args){
        MyThread t = new MyThread();
        MyThread t2 = new MyThread();
        t.start();
        t2.start();
        
    }
}