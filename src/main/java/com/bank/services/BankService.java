package com.bank.services;

import com.bank.models.BankAccount;
import com.bank.models.Transaction;
import com.bank.models.User;

import java.math.BigDecimal;
import java.util.List;

public class BankService {

    private String createAccount;
    private int transfer;
    private int getTransactionHistory;
    private int getTotalBalance;

    public void createAccount(User user, String accountNumber) {
        BankAccount account = new BankAccount(accountNumber, user.getName());
        user.addAccount(account);
    }

    public void transfer(BankAccount source, BankAccount target, BigDecimal amount) {
        // Просто заглушка
        System.out.println("Transfer from " + source.getAccountNumber() + " to " + target.getAccountNumber() + ": " + amount);
    }

    public List<Transaction> getTransactionHistory(BankAccount account) {
        // Тоже заглушка
        return List.of();
    }
}
