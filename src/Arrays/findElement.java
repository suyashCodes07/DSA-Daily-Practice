package Arrays;
import java.util.*;

public class findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int number = sc.nextInt();
        ArrayHandler handler = new ArrayHandler(number);

        handler.inputElements();
        handler.displayElements();

        // Input key to search
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        // Perform linear search
        int index = SearchUtility.linearSearch(handler.getElements(), key);

        // Output result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
