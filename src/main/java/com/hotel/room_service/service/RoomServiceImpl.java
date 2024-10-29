package com.hotel.room_service.service;

import com.hotel.room_service.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;
    @Override
    public void getRoom(int roomId) {
        roomRepository.getRoom(roomId);

    }
}
