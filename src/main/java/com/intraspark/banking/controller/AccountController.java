package com.intraspark.banking.controller;

import com.intraspark.banking.dto.AccountDto;
import com.intraspark.banking.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // Add Account REST APi
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    // Get Account REST API
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable Long id){
        return new ResponseEntity<>(accountService.getAccountByID(id), HttpStatus.OK);
    }

    // Deposit REST API
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id, @RequestBody Map<String ,Double> request){
        Double amount = request.get("amount");
        return new ResponseEntity<>(accountService.deposit(id, amount), HttpStatus.OK);
    }

    // Withdraw REST API

    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id, @RequestBody Map<String ,Double> request){
        Double amount = request.get("amount");
        return new ResponseEntity<>(accountService.withdraw(id, amount), HttpStatus.OK);
    }

    // Transfer REST API

    @PutMapping("/{fromAccountId}/transfer/{toAccountId}")
    public ResponseEntity<AccountDto> transfer(@PathVariable Long fromAccountId, @PathVariable Long toAccountId, @RequestBody Map<String ,Double> request){
        Double amount = request.get("amount");
        return new ResponseEntity<>(accountService.transfer(fromAccountId, toAccountId, amount), HttpStatus.OK);
    }

    // Check Balance REST API

    @GetMapping("/{id}/balance")
    public ResponseEntity<AccountDto> checkBalance(@PathVariable Long id){
        return new ResponseEntity<>(accountService.checkBalance(id), HttpStatus.OK);
    }

    // Get All Accounts REST API

    @GetMapping("/all")

    public ResponseEntity<AccountDto> getAllAccounts(){
        List<AccountDto> accounts =  accountService.getAllAccounts();
        return new ResponseEntity(accounts, HttpStatus.OK);
    }

    // Delete Account REST API

    @DeleteMapping("/{id}")

    public ResponseEntity<AccountDto> deleteAccount(@PathVariable Long id){
        return new ResponseEntity<>(accountService.deleteAccount(id), HttpStatus.OK);
    }



}
