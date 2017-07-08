package com.example.app;

import com.example.client.HelloApp;
import com.example.client.HelloAppService;

/**
 * Created by Jack on 2017/7/9.
 */
public class App {
    public static void main(String[] args){
        //使用wsimport命令生成客户端调用服务的代码
        //wsimport -s . -p com.example.client http://192.168.1.100:8080/hello?wsdl
        //加上-p选项，可以指定生成的客户端代码的包信息

        HelloAppService service = new HelloAppService();
        HelloApp helloApp = service.getHelloAppPort();
        System.out.println(helloApp.sayHello("Tom"));
    }
}
