package cn.bdqn.test;

import cn.bdqn.mapper.AccountMapper;
import cn.bdqn.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testSpring() throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        AccountService accountService = (AccountService) ac.getBean("accountService");

        System.out.println(accountService);
    }

    @Test
    public void testMapper() throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        AccountMapper accountMapper = (AccountMapper) ac.getBean("accountMapper");

        System.out.println(accountMapper);
    }
}
