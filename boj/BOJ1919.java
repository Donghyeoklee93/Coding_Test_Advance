package codingtest.boj;
import java.util.Scanner;

public class BOJ1919 {

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        int[] countA = getAlphabetCount(word1);
        int[] countB = getAlphabetCount(word2);

        int answer = 0;
        for (int i = 0; i < 26; i++) {

            answer += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(answer);
    }
}
