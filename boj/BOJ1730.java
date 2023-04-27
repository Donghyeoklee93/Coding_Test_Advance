package codingtest.boj;

import java.util.Scanner;

public class BOJ1730 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String command = sc.hasNext() ? sc.next() : "";

        boolean[][] passVertical = new boolean[N][N];
        boolean[][] passHorizontal = new boolean[N][N];
        int x = 0;
        int y = 0;

        for (int i = 0; i < command.length(); i++) {
            char cmd = command.charAt(i);
            if (cmd == 'D') {
                if (x == N - 1) continue;
                passVertical[x][y] = passVertical[x + 1][y] = true;
                x++;

            } else if (cmd == 'U') {
                if (x == 0) continue;
                passVertical[x][y] = passVertical[x - 1][y] = true;
                x--;


            } else if (cmd == 'L') {
                if (y == 0) continue;
                passHorizontal[x][y] = passHorizontal[x][y - 1] = true;
                y--;

            } else {
                if (y == N - 1) continue;
                passHorizontal[x][y] = passHorizontal[x][y + 1] = true;
                y++;
            }
        }


        for (int i = 0; i < N; i++) {
            String ans = "";
            for (int j = 0; j < N; j++) {
                if (passVertical[i][j] && passHorizontal[i][j]) ans += "+";
                else if (passVertical[i][j]) ans += "|";
                else if (passHorizontal[i][j]) ans += "-";
                else ans += ".";
            }
            System.out.println(ans);
        }
    }
}
