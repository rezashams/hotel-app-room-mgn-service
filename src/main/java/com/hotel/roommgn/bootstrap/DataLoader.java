/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.roommgn.bootstrap;

import com.hotel.roommgn.model.Room;
import com.hotel.roommgn.service.RoomService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final RoomService roomService;

    public DataLoader(RoomService roomService) {
        this.roomService = roomService;
    }

    @Override
    public void run(String... args) throws Exception {
        Room room1 = new Room();
        room1.setName("room1");
        room1.setPrice(12);
        room1.setDescription("first room");
        roomService.saveRoom(room1);

        Room room2 = new Room();
        room2.setName("room2");
        room2.setPrice(23);
        room2.setDescription("The second room");
        roomService.saveRoom(room2);

        System.out.println("Load Data ...");
    }
}
