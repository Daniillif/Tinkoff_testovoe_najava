package org.example;
//задача решена не верно , не проходило последнюю проверку в ответе должно быть [5,-11,-5] вроде
import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//колво  количество проверок
        int c = scanner.nextInt();//колво максимальное количество изменений
        int d = scanner.nextInt();//1≤d≤109
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //найти миниимальное число из массива и вычитать из него C раз по d штук
        int min = arr[0];
        int index = 0;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < c; i++) {
            arr[index] -= d;
            for (int k : arr) {
                if (Math.abs(k) < min) {
                    min = k;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (min == arr[j]) {
                    index = j;
                    break;
                }
            }

        }System.out.println(Arrays.toString(arr));
    }
}
