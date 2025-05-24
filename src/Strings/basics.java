package Strings;

import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //character array
        char [] arr = new char[10];
        //STRING IS A TYPE OF CHARACTER ARRAY
        String str="SUYASH DWIVEDI";
        System.out.println(str);

        //input of string
        String name = sc.next(); //this has a con that it does not read space
        System.out.println(name);

        //2ND WAY OF TAKING STRING INPUT
        String namE = sc.nextLine();
        System.out.println(namE);
    }
}
