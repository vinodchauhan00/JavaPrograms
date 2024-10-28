package Object_class;
public class BankAccount {
    public static void main(String[] args) {
         Bank c1 = new Bank(1234);
         c1.checkBal();
         c1.deposit(1000);
         c1.checkBal();
         c1.withdraw(1200);
         c1.withdraw(100); 
         c1.checkBal();
    }  
}
class Bank {
    int num;
    double bal;

    Bank(int num) {
        this.num = num;
        this.bal = 0.0;
    }

    void checkBal() {
        System.out.println("Account Number : " + num + " Balance : " + bal);
    }

    void deposit(double amount) {
        this.bal = this.bal + amount;
    }

    void withdraw(double amount) {
        if (this.bal > amount) {
            this.bal = this.bal - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
