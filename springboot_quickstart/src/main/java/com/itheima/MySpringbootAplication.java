package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//声明该类是一个springboot的引导类
@SpringBootApplication
public class MySpringbootAplication {

    public static void main(String[] args) {
        //run方法表示运行springboot的引导类 run参数就是springboot的引导类的字节码对象
        SpringApplication.run(MySpringbootAplication.class);
    }

}
