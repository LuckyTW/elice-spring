package com.example.elice.main;

import com.example.elice.config.ProjectConfig;
import com.example.elice.model.Song;
import com.example.elice.services.VehicleServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example17 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());

        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleServices.playMusic(vehicleStarted,song);
        String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
    }
}
