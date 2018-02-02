package com.xiaohei.test;

import com.xiaohei.domain.StudentParameter;
import com.xiaohei.mapper.StudentDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    private ApplicationContext context;
    private StudentDao studentDao;

    @Before
    public void init(){

        context =
                new ClassPathXmlApplicationContext("classpath*:spring-*.xml");

        studentDao = context.getBean(StudentDao.class);

    }

    @Test
    public void startSpring(){

        int count = studentDao.getTotalRecord(new StudentParameter("", 1, 10));

        System.out.println(count);

    }

}
