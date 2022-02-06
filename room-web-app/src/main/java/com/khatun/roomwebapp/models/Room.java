package com.khatun.roomwebapp.models;

import javax.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {
    // map attributes in ROOM class with attributes in schema.sql
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //alternative for AUTO_INCREMENT in SQL
    private long id;

    @Column(name="ROOM_NUMBER")
    private String number;

    @Column(name="NAME")
    private String name;

    @Column(name="BED_INFO")
    private String info;

    public Room() {}

    public Room(long id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }


}
