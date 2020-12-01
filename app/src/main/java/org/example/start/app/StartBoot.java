package org.example.start.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("org.example.start")
@EnableSwagger2
public class StartBoot {
    public static void main(String args[]){
        SpringApplication.run(StartBoot.class,args);
    }
}
