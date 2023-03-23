import java.util.Scanner;

public class Greedy14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(Math.min((Math.round(m / 2.0)), 4));
        } else if (n >= 3) {
            if (m >= 7) {
                System.out.println(m - 2);
            } else {
                System.out.println(Math.min(m, 4));
            }
        }
    }
}

