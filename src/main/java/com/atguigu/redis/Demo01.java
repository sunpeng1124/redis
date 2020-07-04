package com.atguigu.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.13.113",6379);
        String pong = jedis.ping();
        System.out.println("连接成功："+pong);

        jedis.set("k1", "v1");
        jedis.set("k2", "v2");
        jedis.set("k3", "v3");
        Set<String> keys = jedis.keys("*");
        System.out.println(keys.size());
        for (String key : keys) {
            System.out.println(key);
        }


        jedis.close();
    }
}
