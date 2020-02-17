package cn.TravelPlanner.test;

import cn.TravelPlanner.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zack
 * @create 2020-02-16-22:48
 */
public class TravelPlannerTest {
    @Test
    public void run1() {
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService = (AccountService) ac.getBean("accountService");
        //调用查找所有的方法
        accountService.findAll();
    }
}
