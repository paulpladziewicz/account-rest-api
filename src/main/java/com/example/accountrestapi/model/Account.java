package com.example.accountrestapi.model;

import java.time.LocalDateTime;

public class Account {
    private final int id;
    private final String account_type;
    private double interest_rate;
    private int balance;
    private final LocalDateTime open_date;

    public Account(int id, String account_type, double interest_rate, int balance, LocalDateTime open_date) {
        this.id = id;
        this.account_type = account_type;
        this.interest_rate = interest_rate;
        this.balance = balance;
        this.open_date = open_date;
    }

    public int getId() {
        return id;
    }

    public String getAccount_type() {
        return account_type;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public LocalDateTime getOpen_date() {
        return open_date;
    }

    @Override
    public String toString() {
        return "MutableAccount{" +
                "id=" + id +
                ", account_type='" + account_type + '\'' +
                ", interest_rate=" + interest_rate +
                ", balance=" + balance +
                ", open_date=" + open_date +
                '}';
    }
}
