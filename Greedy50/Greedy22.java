import java.util.Arrays;
import java.util.Scanner;

public class Greedy22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ropeWeight = new int[n];

        for (int i = 0; i < n; i++) {
            ropeWeight[i] = sc.nextInt();
        }

        Arrays.sort(ropeWeight);

        int index = n;
        int initialWeight = ropeWeight[0] * index;

        for (int i = 1; i < n; i++) {
            int compareWeight = ropeWeight[i] * (index - 1);
            index--;

            if(initialWeight < compareWeight){
                initialWeight = compareWeight;
            }
        }
        System.out.println(initialWeight);


    }
}