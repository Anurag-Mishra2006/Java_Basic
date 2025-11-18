import java.util.Scanner;

public class countNoOfChar {

        public static void main(String []ags){
            // code for the taking string as input and gives the no. of characters in the words
            Scanner sc  = new Scanner(System.in);
            int cnt = 0;
            // taking input from the user: 
            System.out.println("Enter the Word: ");
            String s = sc.nextLine();

            // for(char c : s){
            //     if(c == ' ')continue;
                
            // }// we cannot use for each in String as it is not iterable

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' ')continue;
                cnt++;
            }
            System.out.print("The character counts are: ");
            System.out.println(cnt);
        }
}
