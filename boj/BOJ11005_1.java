package codingtest.boj;

import java.io.IOException;
import java.util.Scanner;

public class BOJ11005_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        String ans = "";
        while (N > 0) {
            int D = N % B;
            if (D < 10) ans += D;
            else ans += (char) (D - 10 + 'A');
            N = N / B;
        }

        for (int i = ans.length() - 1; i >= 0; i--)
            System.out.print(ans.charAt(i));
    }
}
