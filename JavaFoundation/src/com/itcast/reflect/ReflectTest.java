package com.itcast.reflect;

/**
 * 框架类
 */

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 实现：
 *     1、配置文件
 *     2、反射
 * 步骤：
 *      1、将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 *      2、在程序中加载读取配置文件
 *      3、使用反射技术来加载类文件进内存
 *      4、创建对象
 *      5、执行方法
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类对象，执行任意方法
    /*
       前提：不能改变该类任何代码。可以创建任意类对象，执行任意方法
     */
    /*
    Person p = new Person();
    p.eat();
     */
    //1.加载配置文件
    //1.1创建Properties对象
        Properties pro = new Properties();
    //1.2加载配置文件，转换为一个集合
    //1.2.1获取class目录下的配置文件
    ClassLoader classloader = ReflectTest.class.getClassLoader();
    InputStream is = classloader.getResourceAsStream("pro.properties");
    pro.load(is);

    //2.获取配置文件中定义的数据
    String className = pro.getProperty("className");
    String methodName = pro.getProperty("methodName");

    //3.加载该类内存
    Class cls = Class.forName(className);
    //4.创建对象
    Object obj = cls.newInstance();
    //5.获取方法对象
    Method method = cls.getMethod(methodName);
    //6.执行方法
    method.invoke(obj);


    }
}
