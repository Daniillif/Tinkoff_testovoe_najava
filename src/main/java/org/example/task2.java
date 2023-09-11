package org.example;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//колво символов в строке
        int k = scanner.nextInt();//колво удаления символов
        String p = scanner.next();//строка
        Map<Character, Integer> arr = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (arr.containsKey(p.charAt(i))) {
                arr.put(p.charAt(i), arr.get(p.charAt(i)) + 1);
            } else
                arr.put(p.charAt(i), 1);
        }
        System.out.println(ReturnNumOfChars(arr, k));


    }

    public static int ReturnNumOfChars(Map<Character, Integer> arr, int k) {
        for (int i = 0; i < k; i++) {
            int min=arr.size();
            int max=0;
            for (Map.Entry<Character, Integer> res: arr.entrySet()) {
                if(res.getValue()>max){
                    max = res.getValue();

                }if(res.getValue()<min){
                    min= res.getValue();
                }
            }
            for (Map.Entry<Character, Integer> res: arr.entrySet()) {
                if(res.getValue()==min){
                    arr.remove(res.getKey());
                    break;
                }
            }
            }return arr.size();
        }
    }









