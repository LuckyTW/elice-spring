package com.example.elice.main;

import com.example.elice.beans.Vehicle;
import com.example.elice.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle2 = applicationContext.getBean(Vehicle.class);
        System.out.println("vehicle with spring context: " + vehicle2.getName());
        vehicle2.printHello();
        applicationContext.close();
    }

}
