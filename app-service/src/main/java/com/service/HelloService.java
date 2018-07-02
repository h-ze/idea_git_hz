package com.service;

import com.dao.HelloDAO;

/**
 * Created by 11022 on 2018/7/1 0001.
 */
public class HelloService {
    public String sayHelloService(String name){
        HelloDAO helloDAO = new HelloDAO();
        return helloDAO.sayHello(name);
    }
}
