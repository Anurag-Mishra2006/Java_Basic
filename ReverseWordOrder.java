import java.util.Scanner;
// problem : Take a sentence as input and reverse the order of words in the sentence
public class ReverseWordOrder {
    public static void main(String []ags){
        Scanner sc = new Scanner(System.in);
        // taking input
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();

        String []s = sentence.split(" ");
        System.out.println("Printing the string in reversed Order: ");
        for(int i = s.length-1; i >= 0; i--){
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}
