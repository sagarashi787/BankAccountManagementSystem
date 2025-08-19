package com.bank.models;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String user;
    private int transactions;

    public BankAccount(String accountNumber, double balance, String user, int transactions) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.user = user;
        this.transactions = transactions;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getTransactions() {
        return transactions;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    public double deposit() {
        return balance + transactions;
    }
    public double withdraw() {
        return balance - transactions;
    }
    public int addTransaction() {
        transactions++;
    }
}
