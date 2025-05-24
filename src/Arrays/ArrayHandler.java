package Arrays;

import java.util.Scanner;

// Encapsulated class
public class ArrayHandler {
    // Private fields (Encapsulation)
    private int[] elements;
    private int size;

    // Constructor
    public ArrayHandler(int size) {
        this.size = size;
        this.elements = new int[size];
    }

    // Public method to input elements using Scanner
    public void inputElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }
    }

    // Getter to retrieve the array
    public int[] getElements() {
        return elements;
    }

    // Method to display array
    public void displayElements() {
        System.out.print("Array elements: ");
        for (int num : elements) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

