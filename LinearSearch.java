import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] arr = {1,2,4,5};
        // int target = in.nextInt();
        // System.out.println(MyLinearSearch(arr, target));
        String str = "thisisastring";
        char target = 'm';
        System.out.println(MyStringLinearSearch(str, target));
    }

    static boolean MyLinearSearch(int[] arr, int target){
        for(int element : arr){
            if(target == element){
                return true;
            }
        }
        return false;
    }

    static boolean MyStringLinearSearch(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
