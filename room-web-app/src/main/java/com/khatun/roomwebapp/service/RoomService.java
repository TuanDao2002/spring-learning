package com.khatun.roomwebapp.service;

import com.khatun.roomwebapp.data.RoomRepository;
import com.khatun.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
//    private static final List<Room> rooms = new ArrayList<>();
//
//    static {
//        for (int i = 0; i < 10; i++) {
//            rooms.add(new Room(i, "Room " + i, "R" + i, "Q"));
//        }
//    }

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


//    public List<Room> getAllRooms() {
//        return rooms;
//    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

}
