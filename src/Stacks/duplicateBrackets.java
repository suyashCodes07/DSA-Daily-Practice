//YOU HAVE TO PRINT TRUE IF YOU DETECT EXTRA/NEEDLESS BRACKET ((C+D)) => both brackets wrap same therefore true!!!!

package Stacks;
import java.util.*;
import java.util.Stack;
public class duplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st;
        System.out.println("ENTER A STRING WITH PARENTHESIS");
        st=sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch==')') {
                if (stack.peek()=='('){
                    System.out.println("True");
                    return;
                }
                else {
                    while (stack.peek() != '('){
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }

        }
        System.out.println("False");
    }
}

