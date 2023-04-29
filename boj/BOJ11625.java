package codingtest.boj;

import java.util.HashMap;
import java.util.Scanner;

public class BOJ11625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<Long, Integer> map = new HashMap<>();

        int max = 0;
        long x = 0;
        for (int i = 0; i < N; i++) {
            Long num = sc.nextLong();
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > max) {
                max = map.get(num);
                x = num;
            } else if (map.get(num) == max) {
                x = Math.min(x, num);
            }
        }
        System.out.println(x);
    }
}
