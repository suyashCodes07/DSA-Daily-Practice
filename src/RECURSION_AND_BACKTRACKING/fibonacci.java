package RECURSION_AND_BACKTRACKING;

import java.util.*;
public class fibonacci {

    public static int fibonacciNumber(int number){
        if(number<2){
            return number;
        }
        return fibonacciNumber(number-1)+fibonacciNumber(number-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num = sc.nextInt();
        System.out.println(fibonacciNumber(num));
    }
}
