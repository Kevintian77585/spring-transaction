package com.kevin.transactional.controller;

import com.kevin.transactional.model.Account;
import com.kevin.transactional.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevin
 * @ClassName AccountController
 * @Date 2019/11/240:37
 */
@RestController
public class AccountController {
    @SuppressWarnings("all")
    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public Account getAccount() {
        return accountService.getAccount();
    }

    @GetMapping("/add")
    public Object addMoney() {
        try {
            accountService.addMoney();
        } catch (Exception e) {
            return "发生异常：" + accountService.getAccount();
        }
        return getAccount();
    }
}
