package Sorting;

import java.util.*;

public class selectionSort {
    static void selectionSort(int arr[], int size) {
        for (int i = 0; i < size-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < size; j++) {
                if (arr[minIndex]>arr[j]){
                    arr[j]=arr[j]+arr[minIndex];
                    arr[minIndex]=arr[j]-arr[minIndex];
                    arr[j]=arr[j]-arr[minIndex];
                }
            }
        }
        for (int i = 0; i < size ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        selectionSort(arr,size);
    }
}
