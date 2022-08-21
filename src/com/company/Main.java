package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UserAccount account1 = new UserAccount("0101385047", "Daniel Favour", "141123");
        UserAccount account2 = new UserAccount("0101385048", "Daniel Wisdom", "141419");
        ArrayList<UserAccount> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        ATM atm = new ATM(accounts);
        atm.Start();
    }
}
