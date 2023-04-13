package codingtest.boj;

import java.util.Scanner;

public class BOJ1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        int length = word2.length();

        int count = 0;
        while (word1.length() >= length) {
            String newWord = word1.substring(0, length);

            if (newWord.equals(word2)) {
                count++;
                word1 = word1.substring(length);
            } else {
                word1 = word1.substring(1);
            }
        }

        System.out.println(count);


    }
}
