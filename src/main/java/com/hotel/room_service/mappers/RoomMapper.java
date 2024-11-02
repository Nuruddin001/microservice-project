package com.hotel.room_service.mappers;

import com.hotel.room_service.dtos.RoomDto;
import com.hotel.room_service.entities.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {
    public RoomDto roomToRoomDto(Room room) {

        RoomDto roomDto = new RoomDto();
        roomDto.setRoomNumber(room.getRoomNumber());
        roomDto.setRoomId(room.getRoomId());
        return roomDto;
    }

    public Room roomDtoToRoom(RoomDto roomDto) {
        Room room = new Room();
        room.setRoomNumber(roomDto.getRoomNumber());
        room.setRoomId(roomDto.getRoomId());
        return room;
    }
}
