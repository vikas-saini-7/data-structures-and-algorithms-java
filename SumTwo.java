import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        Sum(a, b);
        
    }

    static void Sum(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
