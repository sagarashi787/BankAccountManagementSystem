package com.bank.models;

public class User {

    private int id;
    private String name;
    private String accounts;

    public User(int id, String name, String accounts) {
        this.id = id;
        this.name = name;
        this.accounts = accounts;
    }

    public String getAccounts() {
        return accounts;
    }

    public void addAccount() {}
//    public void removeAccount() {}

}
