public class IsPalindrome {
    public static void main(String[] args) {
        String str = "kabcccbak";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        char start = str.charAt(0);
        char end = str.charAt(str.length()-1);
        int mid = (str.length()+1)/2;
        boolean ans = true;
        for (int i = 0; i < mid; i++) {
            if(start != end){
                ans = false;
                start++;
                end--;
            }
        }
        return ans;
    }
}
