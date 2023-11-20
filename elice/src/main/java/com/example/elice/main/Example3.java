package com.example.elice.main;

import com.example.elice.beans.Person;
import com.example.elice.beans.Vehicle;
import com.example.elice.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = applicationContext.getBean(Person.class);
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        System.out.println("Person name from Spring context is: " + person.getName());
        System.out.println("Vehicle name from Spring context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }
}
