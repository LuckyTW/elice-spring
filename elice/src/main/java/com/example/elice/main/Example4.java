package com.example.elice.main;

import com.example.elice.beans.Person;
import com.example.elice.beans.Vehicle;
import com.example.elice.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the Person Bean from the Spring context");
        Person person = applicationContext.getBean(Person.class);
        System.out.println("After retrieving the Person Bean from the Spring context");
    }
}
