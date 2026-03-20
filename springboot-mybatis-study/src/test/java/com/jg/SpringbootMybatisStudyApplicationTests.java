package com.jg;

import com.jg.mapper.usermapper;
import com.jg.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisStudyApplicationTests {

    @Autowired
    private usermapper umapper;
    @Test
    public void testlistuser() {
        List<user> userList = umapper.list();
        userList.stream().forEach(user->{
            System.out.println(user);
                });
    }

}
