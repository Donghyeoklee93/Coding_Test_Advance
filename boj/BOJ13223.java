package codingtest.boj;

import java.util.Scanner;

public class BOJ13223 {

    public static int totalSec(String[] arr) {
        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int sec = Integer.parseInt(arr[2]);

        int totalSec = hour * 3600 + min * 60 + sec;

        return totalSec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] currentTime = sc.nextLine().split(":");
        String[] targetTime = sc.nextLine().split(":");

        int result = totalSec(targetTime) - totalSec(currentTime);
        if(result <= 0){
            result += 24 * 3600;
        }

        int resultHour = result / 3600;
        int min = (result % 3600) / 60;
        int sec = (result % 60);

        System.out.printf("%02d:%02d:%02d", resultHour, min, sec);


    }
}