package com.transfer.copysb;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration;

/**
 * @author lizheng
 * @date: 21:57 2019/
 * ateSpringboot
 */
public class ImitateSpringboot {
    public static void run() throws LifecycleException {
        AnnotationConfigWebApplicationContext aw = new AnnotationConfigWebApplicationContext();
        aw.register(AppConfig.class);
//        aw.refresh();

        DispatcherServlet servlet = new DispatcherServlet(aw);
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(10001);
        Context context = tomcat.addContext("/", "d:/embed-tomcat");
        ServletRegistration.Dynamic dynamic = context.getServletContext().addServlet("dispatcherServlet", servlet);
        dynamic.setLoadOnStartup(1);
        dynamic.addMapping("/");
        tomcat.start();
        tomcat.getServer().await();
    }
}
