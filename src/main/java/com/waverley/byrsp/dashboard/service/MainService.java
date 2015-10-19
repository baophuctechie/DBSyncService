package com.waverley.byrsp.dashboard.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhnguyen on 10/12/15.
 * The main service class to run the batch job.
 */
public class MainService {

    public static void main(String[] args) {
        String[] str = {"classpath:META-INF/spring/job-config.xml","classpath:META-INF/spring/context-config.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(str);
    }
}
