package com.bank.services;

public class BankService {

    private String createAccount;
    private int transfer;
    private int getTransactionHistory;
    private int getTotalBalance;

    public BankService(String createAccount, int transfer, int getTransactionHistory, int getTotalBalance) {
        this.createAccount = createAccount;
        this.transfer = transfer;
        this.getTransactionHistory = getTransactionHistory;
        this.getTotalBalance = getTotalBalance;
    }
}
