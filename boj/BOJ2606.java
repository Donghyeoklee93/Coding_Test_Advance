package codingteststudy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2606 {

    static int computer;
    static int edge;
    static int[][] graph;
    static int[] result;
    static int worm;

    static void input() {
        Scanner sc = new Scanner(System.in);
        computer = sc.nextInt();
        edge = sc.nextInt();
        graph = new int[computer + 1][computer + 1];
        result = new int[computer + 1];

        for (int i = 1; i <= edge; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
            graph[y][x] = 1;
        }


//        //graph print
//        for (int i = 0; i < computer + 1; i++) {
//            System.out.println(Arrays.toString(graph[i]));
//        }

    }

    //DFS
    static void pro(int index) {
//        worm++;

        result[index] = 1;
        for (int i = 1; i < computer + 1; i++) {
            if (graph[index][i] == 1 && result[i] != 1) {
                pro(i);
            }
        }

    }


    public static void main(String[] args) {
        input();
        pro(1);

        // print 1
//        System.out.println(Arrays.toString(result));

        int number = 0;
        for (int i = 2; i < computer + 1; i++) {
            number = number + result[i];
        }
        System.out.println(number);


//        // print 2
//        System.out.println(worm - 1);

    }
}
