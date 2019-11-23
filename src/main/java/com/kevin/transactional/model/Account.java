package com.kevin.transactional.model;

import java.math.BigDecimal;

/**
 * @author kevin
 * @ClassName Account
 * @Date 2019/11/240:40
 */
public class Account {

    private String accountId;
    private String accountName;
    private BigDecimal balance;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
