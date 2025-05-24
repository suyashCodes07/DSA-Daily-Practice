package Strings;

import java.util.*;

public class allSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String userInput = sc.nextLine();
        for (int i = 0; i < userInput.length(); i++) {
            for (int j = i + 1; j < userInput.length() + 1; j++) {
                System.out.print(userInput.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
