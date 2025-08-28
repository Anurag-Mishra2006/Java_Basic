public class Array {
    
    public static void main(StringLearning []args){
        int arr[] = {1,2,3,4,5,6};
        int arr2[] = arr.clone();
        arr2[2] = 100;
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr2[i]+ " ");
        }

        System.out.println();
    }
}
