package com.intraspark.banking.service;

import com.intraspark.banking.dto.AccountDto;
import java.util.List;


public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountByID(Long id);
    AccountDto deposit(Long id, Double amount);
    AccountDto withdraw(Long id, Double amount);
    AccountDto transfer(Long fromAccountId, Long toAccountId, Double amount);
    AccountDto checkBalance(Long id);
    List<AccountDto> getAllAccounts();
    AccountDto deleteAccount(Long id);

}
