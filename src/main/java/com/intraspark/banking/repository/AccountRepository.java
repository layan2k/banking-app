package com.intraspark.banking.repository;

import com.intraspark.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountHolderName(String accountHolderName);
    Account findByAccountHolderNameAndBalance(String accountHolderName, Double balance);
    List<Account> findByBalanceGreaterThan(Double balance);
    List<Account> findByBalanceLessThan(Double balance);

}
