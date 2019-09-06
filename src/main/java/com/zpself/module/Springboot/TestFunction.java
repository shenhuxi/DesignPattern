package com.zpself.module.Springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestFunction {

    @Test
    public void Test(){
        String function="getBudgetByYearMonth(部门预算执行进度具体分析,TOP1,2019,7)";
        log.info(function);
        log.info("最终值为-----------------");
    }
}