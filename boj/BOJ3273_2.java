package codingtest.boj;

import java.util.Scanner;

public class BOJ3273_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        int X = sc.nextInt();

        boolean[] exist = new boolean[10000001];
        for (int i = 0; i < N; i++)
            exist[a[i]] = true;

        int ans = 0;
        for (int i = 1; i <= (X - 1) / 2; i++) {
            if (i <= 1000000 && X - i <= 1000000)
                ans += (exist[i] && exist[X - i]) ? 1 : 0;
        }
        System.out.println(ans);
    }
}