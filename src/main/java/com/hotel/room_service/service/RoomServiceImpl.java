package com.hotel.room_service.service;

import com.hotel.room_service.dtos.RoomDto;
import com.hotel.room_service.entities.Room;
import com.hotel.room_service.mappers.RoomMapper;
import com.hotel.room_service.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private RoomMapper roomMapper;
    @Override
    public RoomDto getRoom(UUID id) {
        Room room = roomRepository.getReferenceById(id);
        return roomMapper.roomToRoomDto(room);

    }

    @Override
    public String addRoom(RoomDto roomDto) {
        //Room room = roomRepository.save(roomDto);
        Room room = roomMapper.roomDtoToRoom(roomDto);
        roomRepository.save(room);
        return "Room saved";

    }

    @Override
    public RoomDto updateRoom(UUID id, RoomDto roomDto) {
        Room room = roomRepository.getReferenceById(id);
        room.setRoomNumber(roomDto.getRoomNumber());
        room.setRoomId(roomDto.getRoomId());
        Room updatedRoom = roomRepository.save(room);
        return roomMapper.roomToRoomDto(updatedRoom);
    }

    @Override
    public String deleteRoom(UUID id) {
        roomRepository.deleteById(id);
        return "room deleted";
    }
}
