/*
 * Copyright (c) 2021 Birmingham City University. All rights reserved.
 * Author:  Reza Shams (rezashams86@gmail.com)
 */
package com.hotel.roommgn.repository;

import com.hotel.roommgn.model.BookRoom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRoomRepository extends CrudRepository<BookRoom,Long> {
    //select case when count(*)> 0 then true else false end  FROM BOOK_ROOM  WHERE '2018-05-11'  BETWEEN DATE_FROM AND DATE_TO;
   /* @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM book_room c" +
            " WHERE (c.room_id = :roomId and (:fromDate between c.date_to ) ) ")
    boolean isRoomAvailable(Long roomId, String fromDate , String toDate);*/
}
