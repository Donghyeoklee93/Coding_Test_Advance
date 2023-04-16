package codingteststudy;

import java.util.Scanner;

public class BOJ1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split("-" );
//        System.out.println(Arrays.toString(array));
//        System.out.println("-----------");

        int[] intArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            String[] stringArray = array[i].split("\\+");
//            System.out.println(Arrays.toString(stringArray));

            int sum = 0;
            for(int j= 0; j < stringArray.length; j++){
                sum = sum + Integer.parseInt(stringArray[j]);
            }
            intArray[i] = sum;
        }

//        System.out.println("-----------");
//        System.out.println(Arrays.toString(stringArray));

        int result = intArray[0];
        for(int i = 1; i < intArray.length; i++){
            result = result - intArray[i];
        }

        System.out.println(result);

    }
}