package com.bank.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountNumber;
    private BigDecimal balance;
    private String owner;
    private List<Transaction> transactions;

    public BankAccount(String accountNumber, String owner, double balance, int transactions) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = BigDecimal.ZERO;
        this.transactions = new ArrayList<>();
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        // Здесь нужно добавить создание транзакции
    }

    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            // Здесь нужно добавить создание транзакции
        } else {
            throw new IllegalArgumentException("Недостаточно средств");
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public List<Transaction> getTransactions() {  // Возвращаем список, а не int
        return transactions;
    }
}


