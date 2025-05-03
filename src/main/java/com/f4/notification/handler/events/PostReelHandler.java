package com.f4.notification.handler.events;

import org.springframework.stereotype.Component;

import com.f4.notification.handler.EventHandler;
import com.f4.notification.service.NotificationService;
import com.f4.notification.service.dto.NotificationDTO;

@Component
public class PostReelHandler implements EventHandler<NotificationDTO> {
    private final NotificationService svc;

    public PostReelHandler(NotificationService svc) {
        this.svc = svc;
    }

    public String getEventName() {
        return "postReel";
    }

    public void handle(NotificationDTO dto) {
        svc.save(dto);
    }
}
