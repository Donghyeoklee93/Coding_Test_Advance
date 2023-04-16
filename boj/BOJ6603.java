package codingteststudy;

import java.util.Scanner;

public class BOJ6603 {

    static int N; // 숫자 갯수
    static int[] numbers; // 뽑은 숫자 배열
    static boolean[] check; // 방문 체크

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            N = scan.nextInt();
            numbers = new int[N];
            check = new boolean[N];

            if (N == 0) {           // 뽑은 숫자= == 0 : exit
                break;
            }

            for (int i = 0; i < N; i++) {
                numbers[i] = scan.nextInt(); // 오름차순으로 선택, sorting 불필요
            }

            dfs(0, 0);
            System.out.println();
        }
    }

    public static void dfs(int start, int depth) {
        if (depth == 6) {                                  // 출력
            for (int i = 0; i < N; i++) {
                if (check[i] == true) {                    // 체크된 곳만 출력
                    System.out.print(numbers[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = start; i < N; i++) {
            check[i] = true;                                  // 방문한 곳 체크
            dfs(i + 1, depth + 1);                // Recursion
            check[i] = false;
        }
    }
}
