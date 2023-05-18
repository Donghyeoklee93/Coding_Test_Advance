package codingtest.boj;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //code 1
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char alpabet = word.charAt(i);
            int number = alpabet;

            if (65 <= number && number <= 90) {
                number = number + 32;
                System.out.print((char) number);
            } else {
                number = number - 32;
                System.out.print((char) number);
            }
        }



//         //code 2
//        String str = sc.next();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if('A'<= ch && ch <='Z'){
//                System.out.print((char)('a' + ch - 'A'));
//            } else{
//                System.out.print((char)('A' + ch - 'a'));
//            }
//        }



//        //code 3
//        String str = sc.next();
//        String ans = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if ('A' <= ch && ch <= 'Z') {
//                ans += (char) ('a' + ch - 'A');
//            } else {
//                ans += (char) ('A' + ch - 'a');
//            }
//        }
//        System.out.println(ans);

    }
}
