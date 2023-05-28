package codingtest.boj;

import java.util.Scanner;

public class BOJ15486 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[] time, money;

    public static void input() {
        N = sc.nextInt();
        time = new int[N + 1];
        money = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            time[i] = sc.nextInt();
            money[i] = sc.nextInt();
        }
    }

    public static void pro() {
        int[] dp = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            int next = i + time[i];

            if (next <= N + 1) {
                dp[next] = Math.max(dp[next], dp[i] + money[i]);
            }
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
        }

        int MAX = dp[N + 1];
        System.out.print(MAX);

    }


    public static void main(String[] args) {
        input();
        pro();
    }
}
