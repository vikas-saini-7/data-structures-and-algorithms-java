public class Patterns {
    public static void main(String[] args) {
        pattern6(5);
    }

    // * * * *
    // * * * *
    // * * * *
    // * * * *
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }

    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    static void pattern5(int n){

    }

    //      *
    //     **
    //    ***
    //   ****
    //  *****
    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if((row+col) > n ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    //    *****
    //     ****
    //      ***
    //       **
    //        *
    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(row > col){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
