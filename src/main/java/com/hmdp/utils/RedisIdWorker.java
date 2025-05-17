package com.hmdp.utils;

import org.springframework.data.redis.core.StringRedisTemplate;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Component
public class RedisIdWorker {

    //开始时间戳
    private static final long BEGIN_TIMESTAMP = 1735689600L;
    //序列化位数
    private static final int COUNT_BITS = 32;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public long nextId(String keyPrefix){
        //生成时间戳
        LocalDateTime now =  LocalDateTime.now();
        long current = now.toEpochSecond(ZoneOffset.UTC);
        long timestamp = current - BEGIN_TIMESTAMP;

        //生成序列号
        //获取但当前日期，精确到天
        String date = now.format(DateTimeFormatter.ofPattern("yyyy:MM:dd"));
        //自增长
        long count = stringRedisTemplate.opsForValue().increment("icr:" + keyPrefix + ":"+ date);
        //拼接并返回
        return timestamp << COUNT_BITS | count;
    }


}
