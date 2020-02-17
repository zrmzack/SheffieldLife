package cn.TravelPlanner.dao;

import cn.TravelPlanner.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zack
 * @create 2020-02-16-20:59
 */

@Repository
public interface AccountDao {

    //select all users
    @Select("select *from account")
    public List<Account> findAll();

    //save userinfo
    @Insert("insert into account(name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
