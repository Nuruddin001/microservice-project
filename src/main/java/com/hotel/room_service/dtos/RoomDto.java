package com.hotel.room_service.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class RoomDto {

    private int roomNumber;
//    private String description;
    private int roomId;
    private UUID id;
}
