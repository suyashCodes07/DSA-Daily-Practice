package Arrays;

public class SearchUtility {

    // Static method to perform linear search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;  // Return the index if found
            }
        }
        return -1;  // Return -1 if not found
    }
}
