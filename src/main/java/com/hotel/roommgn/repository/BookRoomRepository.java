/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.roommgn.repository;

import com.hotel.roommgn.model.BookRoom;
import org.springframework.data.repository.CrudRepository;

public interface BookRoomRepository extends CrudRepository<BookRoom,Long> {
}
