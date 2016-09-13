package com.feng;


import com.feng.test.JunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//单个文件
@ContextConfiguration(locations ="classpath:applicationContext-base.xml")
//多个文件
//@ContextConfiguration(locations ={"classpath:spring-mybatis.xml","classpath:application-context-provider.xml"})
public class TestJunitTest {

    @Autowired
    private JunitTest junitTest;

    @Test
    public void sumTest() {
        System.out.print("#################"+junitTest.sum(1,2));
        Assert.assertTrue(junitTest.sum(1, 2) == 3);
    }

}
