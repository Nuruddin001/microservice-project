package com.hotel.room_service.controllers;

import com.hotel.room_service.dtos.RoomDto;
import com.hotel.room_service.service.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomServiceImpl roomService;

    @GetMapping("/{roomId}")
    public RoomDto showRoom(@PathVariable int roomId) {
        roomService.getRoom(roomId);

    }
}
