package com.controller;

import com.service.HelloService;

/**
 * Created by 11022 on 2018/7/1 0001.
 */
public class WebTest {
    public static void main(String[] args) {
        HelloService helloService =new HelloService();
        String sayHelloService  = helloService.sayHelloService("zs");

        System.out.println(sayHelloService);
    }

}
