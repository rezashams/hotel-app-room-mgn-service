/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.roommgn.service;

import com.hotel.roommgn.model.Room;
import com.hotel.roommgn.repository.RoomRepository;
import net.bytebuddy.description.method.ParameterList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> findAll() {
        List<Room> rooms = new ArrayList<>();
        roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }

    @Override
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public void deleteRoomById(Long id) {
        roomRepository.deleteById(id);
    }
}
