package com.hotel.room_service.service;

import com.hotel.room_service.dtos.RoomDto;

import java.util.UUID;

public interface RoomService {
    //void getRoom(int roomId);

    public RoomDto getRoom(UUID id);

    String addRoom(RoomDto roomDto);

    RoomDto updateRoom(UUID id, RoomDto roomDto);

    String deleteRoom(UUID id);
}
