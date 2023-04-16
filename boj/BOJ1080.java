package codingteststudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int answer = 0;

        char[][] A = new char[N][M];
        char[][] B = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            A[i] = str.toCharArray();
        }

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            B[i] = str.toCharArray();
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < M - 2; j++) {
                if (A[i][j] == B[i][j])
                    continue;

                answer++;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        A[x][y] = A[x][y] == '1' ? '0' : '1';
                    }
                }
            }
        }

        if (Arrays.deepEquals(A, B)) {
            System.out.println(answer);
            return;
        }

        System.out.println(-1);

    }
}