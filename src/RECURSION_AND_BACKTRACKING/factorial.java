package RECURSION_AND_BACKTRACKING;

public class factorial {
    public static int facotrial(int number){
        if (number==0 || number==1)
            return 1;
        else return number*facotrial(number-1);
    }

    public static void main(String[] args) {
        int num=10;
        System.out.println(facotrial(num));
    }
}
