package org.example;

import java.util.Scanner;

public class task1 {
    static Integer a;
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        int s = scanner.nextInt();//колво серверов
        int n = scanner.nextInt();//колво задач
        task1.a=s;
        int k = ReturnNum(n,s);
        System.out.println(k);
    }

    public static int ReturnNum(int n, int s){
        if(n<s ){
            return n;
        }
        else {
            n-=s;
            --s;
            if(s>=1) {
                return ReturnNum(n, s);
            }
            else return ReturnNum(n,a);
        }
    }
}