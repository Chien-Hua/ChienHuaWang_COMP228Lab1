import javax.swing.*;

public class DriverBank {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Hua Bank box");
        BankAccount data = new BankAccount(44,"Chien-Hua Wang",1200.53);

data.Deposit(4444.20);
data.withdraw(20.20);

        JOptionPane.showMessageDialog(frame, data.getAccountInfo());
       // System.out.print( data.getAccountInfo());
    }
}
