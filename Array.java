import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] arr = {1, 2,3, 4, 5};
        int[] arr  = new int[5];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i ++){
            arr[i] = in.nextInt();
        }

        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        

        // for(int num : arr){
        //     System.out.print(num + " ");
        // }

        System.out.println(Arrays.toString(arr));
    }
    
}
