package codingtest.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        List<Character> list = new ArrayList<>();

        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        while (N > 0) {
            if (N % B < 10) list.add((char) (N % B + '0'));
            else list.add((char) (N % B - 10 + 'A'));
            N = N / B;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}
