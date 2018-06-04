public class BankAccount {
    private int accountNum;
    private String Name;
    private double balance;
    // end variables

    public int getAccountNum() {
        return this.accountNum;
    }

    public String getName() {
        return this.Name;
    }

    public double getBalance (){
        return this.balance = balance;
    }

    // end property

    public BankAccount (int accountNum, String Name,double balance) {
        this.accountNum = accountNum;
        this.Name = Name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    // end of constructor

    //Method for withdraw
    public void withdraw(double depositAmount) {
        if(depositAmount > 0.0) {
            balance = balance - depositAmount;
        }
    }
    //method for deposit
    public void Deposit(double depositAmount) {
        if(depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }
    public String getAccountInfo(){

        String accountData = "Account Number: " + accountNum +"\n"+ "Name: "+ Name + "\n" + "Balance: " + balance;

                return accountData;
    }
}
