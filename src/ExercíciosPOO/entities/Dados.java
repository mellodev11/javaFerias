package entities;

public class Dados {
    private String name;
    private int accountNumber;
    private double balance;

    public Dados(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Dados(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;

        } else {
            System.out.println("Invalid deposit amount.");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount + 5;

        } else {
            System.out.println("Invalid withdraw amount.");
        }

    }

    public String toString() {
        return "Account: " + accountNumber + "," + " " + "Holder: " + name + "," + "Balance: $ " + String.format("%.2f", balance);
    }
}

