package com.hotel.room_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Room {

        private int roomNumber;
        //    private String description;
        private int roomId;
        @GeneratedValue(generator = "UUID")
        @Id
        private UUID id;

}
