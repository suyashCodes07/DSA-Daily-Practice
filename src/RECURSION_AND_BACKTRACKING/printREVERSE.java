package RECURSION_AND_BACKTRACKING;

public class printREVERSE {
    static void printer (int number){
        if (number==1){
            System.out.println("1");
        }
        else{
            System.out.print(number+",");
            printer(number-1);
        }
    }

    public static void main(String[] args) {
        printer(10);
    }
}
