package codingtest.boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ11728 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int sizeA = Integer.parseInt(A);
        int sizeB = Integer.parseInt(B);

        List<Integer> listA = new ArrayList<>(sizeA);
        List<Integer> listB = new ArrayList<>(sizeB);

        for (int i = 0; i < sizeA; i++) {
            String input = sc.next();
            int element = Integer.parseInt(input);
            listA.add(element);
        }

        for (int i = 0; i < sizeB; i++) {
            String input = sc.next();
            int element = Integer.parseInt(input);
            listB.add(element);
        }

        int[] listC = new int[sizeA + sizeB];

        for (int i = 0; i < sizeA; i++) {
            listC[i] = listA.get(i);
        }

        for (int i = 0; i < sizeB; i++) {
            listC[sizeA + i] = listB.get(i);
        }

        Arrays.sort(listC);

        for (int i = 0; i < listC.length; i++)
            System.out.print(listC[i] + " ");
    }
}
