package Strings;

import java.util.*;

public class stringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Suyash Dwivedi";
        int length = name.length();
        System.out.println(length);
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        char c = name.charAt(4); //counting starts from 0
        System.out.println(c);

        String srt1 = "remote";
        String str2 = "CAR";

        int z = srt1.compareTo(str2); //compares character with ASCII value, it also compares cases
        System.out.println(z);


//        WAP TO PRINT ALL CHARACTER FROM USER INPUT STRING??
//        System.out.println("ENTER A STRING");
//        String userInput = sc.nextLine();
//        for (int i = 0; i < userInput.length(); i++) {
//            System.out.print(userInput.charAt(i) + ",");
//        }

        //SUBSTRING:- IT IS A PART OF STRING
        String substring = name.substring(5); //from 5 to end of the string
        System.out.println(substring);
        String substring1 = name.substring(5, 8); //excludes the last index
        System.out.println(substring1);


    }
}
