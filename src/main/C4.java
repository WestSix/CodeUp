package main;

import java.util.Scanner;

public class C4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("\\.");
        int A = Integer.valueOf(arr[0]);
        int B = Integer.valueOf(arr[1]);
        int C = Integer.valueOf(arr[2]);
        String D = String.valueOf(arr[3]);
        System.out.printf("%d.%d.%d.%s", A, B, C, D);

    }

}
