package cn.TravelPlanner.controller;

import cn.TravelPlanner.domain.Account;
import cn.TravelPlanner.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zack
 * @create 2020-02-16-21:25
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询账户信息");
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }
}
