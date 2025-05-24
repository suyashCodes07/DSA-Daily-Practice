package OOPSinJAVA;

class Account {
    private double balance;
    public void setBalance(double balance) {
        //authentication
        boolean result=validate("Suyash", "suyash12");

        //depositing money
        if (result==true){
            this.balance=this.balance+balance;
            System.out.println("Credited successfully");
        }
        else
            System.out.println("INVALID USERNAME/PASSWORD....");
    }
    public void getBalance(double balance){
        //authentication
        boolean result=validate("Suyash", "suyash 12");

        //withdraw
        if (result==true){
            this.balance = this.balance-balance;
            System.out.println(balance+" withdrawal successfull");
        }
        else
            System.out.println("INVALID USERNAME/PASSWORD.....");
    }

    private boolean validate (String userName, String passWord){
        return userName.equalsIgnoreCase("Suyash")&&passWord.equals("suyash 12");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);
        account.getBalance(500);
    }
}
