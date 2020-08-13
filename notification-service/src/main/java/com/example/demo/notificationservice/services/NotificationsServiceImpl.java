package com.example.demo.notificationservice.services;

import org.springframework.stereotype.Service;

@Service
public class NotificationsServiceImpl  implements  NotificationsService{


    @Override
    public String message() {
        return "Welcome to the Notifications Service...";
    }
}
