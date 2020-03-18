package com.spring.bank.account.handler;

import com.spring.bank.account.domain.Account;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/accounts")
public class AccountHandler {



    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Account> getAllAccounts(){
        return Arrays.asList(new Account());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Account getAccounts(@PathVariable long id){
        return new Account();
    }
}
