import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    while(true){
        int ans = 0;
        System.out.println("Type opetator:");
        char op = in.next().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            System.out.println("Type num1 & num2:");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if(op == '+'){
                ans = num1 + num2;
            }
            if(op == '-'){
                ans = num1 - num2;
            }
            if(op == '*'){
                ans = num1 * num2;
            }
            if(op == '/'){
                if(num2 != 0){
                    ans = num1 / num2;
                } else {
                    System.out.println("Divisor cannot be 0");
                }
            }
            if(op == '%'){
                ans = num1 % num2;
            }
            System.out.println(ans);
        } else if(op == 'x' || op == 'x')  {
            break;
        } else {
            System.out.println("You entered wrong operator");
        }
    }
    }
}