package Arrays;

import java.util.*;
public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size= sc.nextInt();
        int arr [] = new int[size];
        System.out.println("ENTER ARRAY ELEMENTS");
        for (int i=0;i<size;i++){
            arr [i]=sc.nextInt();
        }
int max = 0;
        for (int i=0;i<size;i++){
             max=arr[0];
            if (max< arr[i]){
                max=arr[i];
            }
            else continue;
        }
        System.out.println("MAXIMUM ELEMENT="+max);
    }
}
