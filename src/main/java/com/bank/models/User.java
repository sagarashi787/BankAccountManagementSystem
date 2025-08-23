package com.bank.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int idUser;
    private String name;
    private List<BankAccount> accounts;

    public User(int idUser, String name) {
        this.idUser = idUser;
        this.name = name;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }



}
