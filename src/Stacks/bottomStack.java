package Stacks;

import java.util.Stack;
import java.util.*;
public class bottomStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NEW ELEMENT");
        int newElement = sc.nextInt();

        Stack <Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        Stack <Integer> temp = new Stack<>();
        while (stack.size()!=0){
            int element = stack.pop();
            temp.push(element);
        }
        stack.push(newElement);
        while (temp.size()!=0){
            int element = temp.pop();
            stack.push(element);
        }
        System.out.println(stack);
    }
}
