package codingtest.boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ11728_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> A = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            A.add(n);
        }

        List<Integer> B = new ArrayList<>(M);
        for (int i = 0; i < M; i++) {
            int n = sc.nextInt();
            B.add(n);
        }

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while(i < N && j < M){
            int a = A.get(i);
            int b = B.get(j);

            if(a <= b){
                result.add(a);
                i++;
            } else {
                result.add(b);
                j++;
            }
        }

        for(; i<N; i++){
            result.add(A.get(i));
        }

        for(; j<N; j++){
            result.add(B.get(j));
        }

        StringBuilder sb = new StringBuilder();
        for (int e : result){
            sb.append(e + " ");
        }
        System.out.println(sb);
    }
}
