package com.example.accountrestapi.controller;

import com.example.accountrestapi.model.Account;
import com.example.accountrestapi.repository.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountRepository repository;

    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    // GET http://localhost:8080/accounts
    @GetMapping
    public List<Account> findAll() {
        return repository.findAll();
    }
}
