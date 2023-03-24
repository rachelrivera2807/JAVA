package Test;

public class example {
    class BankAccount {
        private double balance; //data is encapsulated
        private String accountNumber;

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    public void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        System.out.println(myAccount.getBalance()); //output: 500
    }
}
