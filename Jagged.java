import java.util.Scanner;

public class Jagged {
    
    public static void main(StringLearning []args){

        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[3];

        Scanner s = new Scanner(System.in);

        // input
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = s.nextInt();
            }
        }

        // output
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
