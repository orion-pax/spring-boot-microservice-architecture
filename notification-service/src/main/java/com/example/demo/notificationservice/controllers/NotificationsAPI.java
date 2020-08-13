package com.example.demo.notificationservice.controllers;

import com.example.demo.notificationservice.services.NotificationsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationsAPI {

    private NotificationsService notificationsService;

    public NotificationsAPI(NotificationsService notificationsService) {
        this.notificationsService = notificationsService;
    }

    @GetMapping("/message/")
    public ResponseEntity<String> message(){
        String message = notificationsService.message();
        return ResponseEntity.ok(message);
    }
}
