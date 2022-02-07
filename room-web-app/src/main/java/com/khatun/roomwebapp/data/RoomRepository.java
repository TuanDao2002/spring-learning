package com.khatun.roomwebapp.data;

import com.khatun.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<{model name}, {datatype of primary key of the mapping database to the model}
public interface RoomRepository extends JpaRepository<Room, Long> {

}
