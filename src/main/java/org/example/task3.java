package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[][] interesting = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                interesting[i][j] = scanner.nextInt();
            }
        }
        ResultOfScan(arr, interesting, m);


//        System.out.println(n + " " + Arrays.toString(arr) + " " + m + " " );
//        for (int i = 0; i < m; i++) {
//            System.out.println(Arrays.toString(interesting[i]));
//        }

    }

    public static void ResultOfScan(int[] arr, int[][] interesting, int m) {
        for (int i = 0; i < m; i++) {
            int start = interesting[i][0];
            int end = interesting[i][1];
            int[] newNums = Arrays.copyOfRange(arr, start - 1, end);

            if (trueOrFalse(newNums)) {
                System.out.println("Yes");

            } else {
                System.out.println("No");

            }
        }

    }

    public static boolean trueOrFalse(int[] newNums) {

        if (newNums.length == 1) {
            return true;
        } else if (newNums.length > 3) {
            if ( newNums[0] <= newNums[1] && newNums[newNums.length - 2] != newNums[newNums.length - 3]) {//newNums[newNums.length - 1] > newNums[newNums.length - 2] &&
                return true;
            }else return false;
        }
            else if (newNums[newNums.length - 1] > newNums[newNums.length - 2] && newNums[0] < newNums[1] ) {
                return false;
            } else
                return true;



    }
}

//|| (newNums[newNums.length - 1] < newNums[newNums.length - 2] && newNums[0] > newNums[1]