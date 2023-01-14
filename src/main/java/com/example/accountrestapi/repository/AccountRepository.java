package com.example.accountrestapi.repository;

import com.example.accountrestapi.model.Account;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepository {

    private final List<Account> accounts = new ArrayList<>();

    public AccountRepository() {
        accounts.add(new Account(
                1,
                "checking",
                0.5,
                50,
                LocalDateTime.now()
        ));
        accounts.add(new Account(
                2,
                "savings",
                2,
                50,
                LocalDateTime.now()
        ));
        accounts.add(new Account(
                3,
                "checking",
                0.5,
                1000,
                LocalDateTime.now()
        ));
    }

    public List<Account> findAll() {
        return accounts;
    }
}
