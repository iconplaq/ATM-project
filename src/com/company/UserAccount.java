package com.company;

public class UserAccount {
    private String accountNumber;
    private String accountName;
    private String password;

    public UserAccount(String accountNumber, String accountName, String password) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPassword() {
        return password;
    }
}
