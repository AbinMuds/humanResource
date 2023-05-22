package com.example.humanresorce.service;

import com.example.humanresorce.domain.Account;
import com.example.humanresorce.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Optional<Account> getAccountById(Long id) {
        return accountRepository.findById(id);
    }

    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    public String deleteAccountById(Long id) {
        accountRepository.deleteById(id);
        return "Account with id: "+ id +" deleted Successfully";
    }

    public Account updateAccount(Account account, Long id) {
        Optional<Account> existAccount = accountRepository.findById(id);
        Account account1 = existAccount.get();
        if(existAccount.isPresent()){
            account1.setId(id);
            account1.setBankName(account.getBankName());
            account1.setAccountNumber(account.getAccountNumber());
            account1.setRoutingNumber(account.getRoutingNumber());
            accountRepository.save(account1);
        }
        return account1;
    }
}
