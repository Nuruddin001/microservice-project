package com.hotel.room_service.repositories;

import com.hotel.room_service.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoomRepository extends JpaRepository<Room, UUID> {
}
