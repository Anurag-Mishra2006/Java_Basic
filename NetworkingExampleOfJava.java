import java.net.*;

public class NetworkingExampleOfJava {
    public static void main(String []args)throws Exception{
       try{
         URL url = new URL("https://www.youtube.com");
        System.out.println("Protocol : " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
    }
}