package Stacks;

public class customStack1{
    private int stack [];
    private int top;
    private int capacity;

    public customStack1(int size) {
        stack = new int[size];
        capacity= size;
        top = -1;
    }

    public void push (int element){
        if (top==capacity-1){
            System.out.println("OVERFLOW");
        }
        else {
            stack = new int[element];
        }
    }

    public int pop (){
        if (top==-1){
            System.out.println("UNDERFLOW");
            return -1;
        }
        else
           return stack[top--];
    }

    public int size (){
        return top+1;
    }

    public void display(){
        for (int i = top; i > 0  ; i--) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}