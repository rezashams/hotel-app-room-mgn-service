/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.roommgn.controller;


import com.hotel.roommgn.model.Room;
import com.hotel.roommgn.service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RoomController {

    private  final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public List<Room> getAllRooms() {
        return roomService.findAll();
    }

    @PostMapping("/delete/room/{id}")
    public ResponseEntity<String> deleteRoom(@PathVariable("id") Long id) {
            roomService.deleteRoomById(id);
            return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }
}
