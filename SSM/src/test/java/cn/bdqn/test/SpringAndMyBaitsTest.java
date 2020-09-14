package cn.bdqn.test;

import cn.bdqn.domain.Account;
import cn.bdqn.mapper.AccountMapper;
import cn.bdqn.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class SpringAndMyBaitsTest {
    @Test
    public void testSpringAndMyBatis() throws Exception{
        ApplicationContext ac =  new ClassPathXmlApplicationContext("beans.xml");

        AccountService accountService = (AccountService) ac.getBean("accountService");

        List<Account> accounts = accountService.queryAll();

        System.out.println(accounts);
    }
}