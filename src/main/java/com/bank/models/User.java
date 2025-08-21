package com.bank.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String name;
    private List<BankAccount> accounts;

    public User(String id, String name, List<BankAccount> accounts) {
        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

}
