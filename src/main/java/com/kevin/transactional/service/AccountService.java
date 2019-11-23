package com.kevin.transactional.service;

import com.kevin.transactional.mapper.AccountMapper;
import com.kevin.transactional.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.print.attribute.standard.RequestingUserName;

/**
 * @author kevin
 * @ClassName AccountService
 * @Date 2019/11/240:38
 */
@Service
public class AccountService {

    @SuppressWarnings("all")
    @Autowired
    private AccountMapper accountMapper;

    public Account getAccount() {
        return accountMapper.getAccount();
    }

    /**
     * Spring的默认的事务规则是遇到运行异常（RuntimeException及其子类）
     * 和程序错误（Error）才会进行事务回滚，
     * 显然SQLException并不属于这个范围。
     * 如果想针对检测异常进行事务回滚，可以在@Transactional
     * 注解里使用 rollbackFor 属性明确指定异常
     */
    @Transactional(rollbackFor = Exception.class)
    public void addMoney() {
        accountMapper.addMoney();
        throw new RuntimeException("模拟异常对事物的影响");
    }
}
