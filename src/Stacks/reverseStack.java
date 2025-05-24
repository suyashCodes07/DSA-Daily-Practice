package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Original Stack = "+stack);
        Stack <Integer> revStack = new Stack<>();
        while (stack.size()!=0){
            int element = stack.pop();
            revStack.push(element);
        }
        System.out.println("Reverse Stack = "+revStack);
    }


}
