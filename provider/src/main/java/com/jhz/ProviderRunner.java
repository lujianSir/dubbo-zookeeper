package com.jhz;


import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import java.io.IOException;
 
/**
 * @author jhz
 * @date 18-8-10 下午10:39
 */
public class ProviderRunner {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("provider start");
        System.in.read();
  }
}