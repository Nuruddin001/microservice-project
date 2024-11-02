package com.hotel.room_service.controllers;

import com.hotel.room_service.dtos.RoomDto;
import com.hotel.room_service.service.RoomService;
import com.hotel.room_service.service.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/getRoom/{id}")
    public RoomDto showRoom(@PathVariable UUID id) {
        return roomService.getRoom(id);

    }

    @PostMapping("/addRoom")
    public String registerRoom(@RequestBody RoomDto roomDto) {
        return roomService.addRoom(roomDto);
    }

    @PutMapping("/updateRoom/{id}")
    public RoomDto updateRoom(@PathVariable UUID id, @RequestBody RoomDto roomDto) {
        return roomService.updateRoom(id, roomDto);
    }

    @DeleteMapping("/deleteRoom/{id}")
    public String deleteRoom(@PathVariable UUID id) {
        return roomService.deleteRoom(id);
    }
}
