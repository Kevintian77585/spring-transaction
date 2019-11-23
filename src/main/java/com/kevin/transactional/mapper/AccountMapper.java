package com.kevin.transactional.mapper;

import com.kevin.transactional.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author kevin
 * @ClassName AccountMapper
 * @Date 2019/11/240:50
 */
@Mapper
public interface AccountMapper {
    @Select("select * from account where account_id=1")
    Account getAccount();

    @Select("update account set balance = balance+100 where account_id=1")
    void addMoney();
}
