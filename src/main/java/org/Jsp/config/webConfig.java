package org.Jsp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("org.Jsp")
@EnableWebMvc
public class webConfig implements WebMvcConfigurer {  /* hamne impleent ye is liye karaya hai ki jisse ye css file ko achee se display kra sake */
    @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**")
                .addResourceLocations("/assets/");
    }

    @Bean // ye view ko resolve krta h bassically kon se controller ke name ke liye kon sa kon sa view call hona chahiye  ye kam view resolve kam krta h
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();

        //btaunga ki is folder me jao --> mapped kroge home .jsp se
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}

