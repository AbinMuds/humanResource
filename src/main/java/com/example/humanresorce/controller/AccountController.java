package com.example.humanresorce.controller;

import com.example.humanresorce.domain.Account;
import com.example.humanresorce.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable Long id){
        return accountService.getAccountById(id);
    }

    @PostMapping
    public Account addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateAccount(@RequestBody Account account, @PathVariable Long id){
        return new ResponseEntity(accountService.updateAccount(account, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteAccountById(@PathVariable Long id){
        accountService.deleteAccountById(id);
    }

}
