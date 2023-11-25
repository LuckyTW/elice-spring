package com.example.elice.config;

import com.example.elice.beans.Person;
import com.example.elice.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.elice.implementation",
        "com.example.elice.services", "com.example.elice.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

//    @Bean
//    Vehicle vehicle() {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Toyota");
//
//        return vehicle;
//    }
//
//    @Bean
//    public Person person(Vehicle vehicle) {
//        Person person = new Person();
//        person.setName("Lucy");
//        person.setVehicle(vehicle);
//        return person;
//    }

//    @Bean
//    Vehicle vehicle2() {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Honda");
//
//        return vehicle;
//    }
//
//    @Primary
//    @Bean
//    Vehicle vehicle3() {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Ferrari");
//
//        return vehicle;
//    }


}
