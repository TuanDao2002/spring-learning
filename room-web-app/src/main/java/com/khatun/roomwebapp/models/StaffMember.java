package com.khatun.roomwebapp.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="EMPLOYEE")
public class StaffMember {
    @Id
    @Column(name="EMPLOYEE_ID")
    private String employeeId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    public StaffMember() {
        this.employeeId = UUID.randomUUID().toString();
    }

    public StaffMember(String employeeId, String firstName, String lastName, Position position) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
