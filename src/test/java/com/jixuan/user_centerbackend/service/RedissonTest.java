package com.jixuan.user_centerbackend.service;

import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class RedissonTest {

    @Resource
    private RedissonClient redissonClient;

    @Test
    public void RedissonTest() {
        // list，数据存在本地 JVM 内存中
        List<String> list = new ArrayList<>();
        list.add("jixuan");
        System.out.println("list: " + list.get(0));
 //       list.remove(0);

        // 数据存在 Redis 的内存中
        RList<String> rList = redissonClient.getList("test-list");
        //rList.add("jixuan");
        System.out.println("rList: " + rList.get(0));
        rList.remove(0);
    }
}