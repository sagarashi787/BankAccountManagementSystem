package com.bank.models;

public class Transaction {

    private int id;
    private int amount;
    private String type;
    private int date;
    private String sourceAccount;
    private String targetAccount;

    public Transaction(int id, int amount, String type, int date, String sourceAccount, String targetAccount) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
    }
}
