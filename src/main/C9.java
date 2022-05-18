package main;
//1080
import java.util.Scanner;

public class C9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int i;

        for(i = 1; i <= a; i ++){

            sum += i;

            if(sum >= a){
                break;
            }

        }

        System.out.println(i);

    }

}
