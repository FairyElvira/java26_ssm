package com.zhiyou.school;

import com.zhiyou.dao.ApplicationRecordMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchoolApplicationTests {

    @Autowired
    ApplicationRecordMapper applicationRecordMapper;

    @Test
    void contextLoads() {
        System.out.println(applicationRecordMapper.getAllMethod());
        System.out.println(applicationRecordMapper.getOneByVidMethod(1001));
    }

}
