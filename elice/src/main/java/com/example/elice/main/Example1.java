package com.example.elice.main;

import com.example.elice.beans.Vehicle;
import com.example.elice.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        /*
        w/o spring context
         */
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("vehicle without spring context: " + vehicle.getName());

        /*
        w. spring context
         */
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle2 = applicationContext.getBean(Vehicle.class);
        System.out.println("vehicle with spring context: " + vehicle2.getName());

        String string = applicationContext.getBean(String.class);
        Integer integer = applicationContext.getBean(Integer.class);
        System.out.println("string with spring context: " + string);
        System.out.println("integer with spring context: " + integer);
    }
}
