public class Performance {
    public static void main(String[] args) {

        // just to try 
        // String str = "Hello World";
        // for (int i = 0; i < str.length(); i++) {
        //     char curr = str.charAt(i);
        //     if(curr == ' '){
        //         continue;
        //     }
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print(str.charAt(j));
        //     }
        //     System.out.println("");
        // }


        // String series = "";
        // for (int i = 0; i < 26; i++) {
        //     char ch = (char)('A'+i);
        //     series = series + ch;
        //     System.out.println(series);
        // }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
