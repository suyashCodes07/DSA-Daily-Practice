package Sorting;
import java.util.*;
public class bubble {
     static void bubbleSort(int[] arr){
        int length=arr.length;
        for (int i=0;i<length;i++){
            for (int j=0;j<length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        bubbleSort(arr);

    }
}
