package org.Jsp;

import org.Jsp.config.webConfig;
import org.apache.catalina.Context;
import org.apache.catalina.Wrapper;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.jasper.servlet.JasperInitializer;
import org.apache.jasper.servlet.JspServlet;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class Main {

    public static void main(String[] args) throws LifecycleException {

        // Create embedded Tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

        // Web application context
        String contextPath = "";
        String baseDoc = new File("src/main/webapp").getAbsolutePath();

        Context context = tomcat.addContext(contextPath, baseDoc);

        // IMPORTANT:
        // Initialize Jasper JSP engine
        context.addServletContainerInitializer(
                new JasperInitializer(),
                null
        );

        // Spring IOC Container
        AnnotationConfigWebApplicationContext springContext =
                new AnnotationConfigWebApplicationContext();

        springContext.register(webConfig.class);

        // DispatcherServlet
        DispatcherServlet dispatcherServlet =
                new DispatcherServlet(springContext);

        // Register DispatcherServlet
        Wrapper servlet = Tomcat.addServlet(
                context,
                "dispatcherServlet",
                dispatcherServlet
        );

        servlet.setLoadOnStartup(1);

        // JSP Servlet
        Wrapper jspServlet = Tomcat.addServlet(
                context,
                "jsp",
                new JspServlet()
        );

        jspServlet.setLoadOnStartup(3);

        // JSP mapping
        context.addServletMappingDecoded(
                "*.jsp",
                "jsp"
        );

        // DispatcherServlet mapping
        context.addServletMappingDecoded(
                "/",
                "dispatcherServlet"
        );

        // Start Tomcat
        tomcat.start();

        System.out.println("Tomcat started on port 8080");

        // Keep server running
        tomcat.getServer().await();
    }
}