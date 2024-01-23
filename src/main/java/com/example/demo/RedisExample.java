package com.example.demo;

import redis.clients.jedis.Jedis;

public class RedisExample {

    public static void main(String[] args) {
        // Kết nối tới Redis server đang chạy trên localhost và cổng mặc định 6379
        try (Jedis jedis = new Jedis("localhost", 6379)) {
String test ="abcdadsssss";
            // Thực hiện một số thao tác cơ bản
            jedis.set("myKey", "Hello, Redis!");
            String value = jedis.get("myKey");
            System.out.println("Value retrieved from Redis: " + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}