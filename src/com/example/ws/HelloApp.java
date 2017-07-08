package com.example.ws;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Jack on 2017/7/9.
 */
//需要加一个WebService注解，这样这个类才能被发布成一个服务
@WebService
public class HelloApp {
    public String sayHello(String name){
        System.out.println("HelloApp.sayHello方法被调用到了...");
        return "hello, " + name;
    }

    public static void main(String[] args){
        HelloApp helloApp = new HelloApp();
        //需要加上http:// http协议的前缀
        //这样就可以访问该服务的wsdl说明文档了，http://192.168.1.100:8080/hello?wsdl
        Endpoint.publish("http://192.168.1.100:8080/hello", helloApp);
    }
}
