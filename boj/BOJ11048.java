package codingtest.boj;

import java.util.Scanner;

public class BOJ11048 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int M;
    static int[][] map;
    static int[][] dy;

    //input
    static void input() {
        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

    }

    static void pro() {
        dy = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                dy[i][j] = Math.max(Math.max(map[i][j] + dy[i - 1][j], map[i][j] + dy[i][j - 1]), map[i][j] + dy[i - 1][j - 1]);
            }
        }
        System.out.println(dy[N][M]);
    }


    public static void main(String[] args) {
        input();
        pro();

    }
}
