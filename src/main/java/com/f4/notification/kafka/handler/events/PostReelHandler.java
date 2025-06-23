package com.f4.notification.kafka.handler.events;

import org.springframework.stereotype.Component;

import com.f4.notification.kafka.handler.EventHandler;
import com.f4.notification.service.ReelService;
import com.f4.notification.service.dto.ReelDTO;

@Component
public class PostReelHandler implements EventHandler<ReelDTO> {
    private final ReelService svc;

    public PostReelHandler(ReelService svc) {
        this.svc = svc;
    }

    public String getEventName() {
        return "postReel";
    }

    public void handle(ReelDTO dto) {
        svc.save(dto);
    }
}
