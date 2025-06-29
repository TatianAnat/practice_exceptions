package com.skypro.account;

import java.util.ArrayList;
import java.util.List;

public class LockedAccount extends Account implements AutoCloseable {
    static List<Account> BLOCKED_ACCOUNTS = new ArrayList<>();

    public LockedAccount(String name, int balance) {
        super(name, balance);
        BLOCKED_ACCOUNTS.add(this);
    }

    public void close() {
        BLOCKED_ACCOUNTS.removeIf(account -> account.getName().equals(name));
    }
}
