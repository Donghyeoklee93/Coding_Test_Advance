package Greedy50;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);

//        System.out.println(Arrays.toString(time));

        int minTime = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j <= i; j++) {
                minTime = minTime + time[j];
            }
        }
        System.out.println(minTime);
    }
}