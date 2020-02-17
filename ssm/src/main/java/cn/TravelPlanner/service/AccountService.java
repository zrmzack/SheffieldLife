package cn.TravelPlanner.service;

import cn.TravelPlanner.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zack
 * @create 2020-02-16-21:00
 */
public interface AccountService {
    //select all users
    public List<Account> findAll();

    //save userinfo
    public void saveAccount(Account account);
}
