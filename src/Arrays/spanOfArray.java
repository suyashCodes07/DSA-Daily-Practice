package Arrays;
import java.util.*;
public class spanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter "+n+ " elements");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n ; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        int span = max - min;
        System.out.println("Span of array is: "+span);


    }
}
