package codingTest;

import java.util.*;

public class Greedy25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<int[]> lectures = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int s = sc.nextInt();
            int t = sc.nextInt();

            lectures.add(new int[] {s, t});
        }

        Collections.sort(lectures, (a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });

        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        rooms.add(lectures.get(0)[1]);

        for(int i = 1; i < lectures.size(); i ++){
            int[] lec = lectures.get(i);

            if (lec[0] < rooms.peek()){
                rooms.add(lec[1]);
            } else{
                rooms.poll();
                rooms.add(lec[1]);
            }
        }
        System.out.println(rooms.size());

    }
}