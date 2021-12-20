/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.roommgn.controller;


import com.hotel.roommgn.model.BookRoom;
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
    public  @ResponseBody List<Room> getAllRooms() {
        return roomService.findAll();
    }

    @GetMapping("/room/{id}")
    public Room getRoom(@PathVariable("id") Long id) {
        return roomService.getRoomById(id);
    }

    @PostMapping("/room/available")
    public Boolean isRoomAvailable(@RequestBody BookRoom bookRoom) {
        return roomService.isRoomAvailable(bookRoom);
    }

    @PostMapping("/room/update/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable("id") Long id, @RequestBody Room room) {
        room.setId(id);
        Room updatedRoom = roomService.updateRoom(room);
        return new ResponseEntity<>(updatedRoom, HttpStatus.CREATED);
    }

    @PostMapping("/room/delete/{id}")
    public ResponseEntity<String> deleteRoom(@PathVariable("id") Long id) {
            roomService.deleteRoomById(id);
            return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/room/create")
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
        Room createdRoom = roomService.saveRoom(room);
        return new ResponseEntity<>(createdRoom, HttpStatus.CREATED);
    }
    @PostMapping("/room/book")
    public ResponseEntity<BookRoom> createBook(@RequestBody BookRoom bookRoom) {
        BookRoom saveBookRoom = roomService.saveBookRoom(bookRoom);
        return new ResponseEntity<>(saveBookRoom, HttpStatus.CREATED);
    }
}
