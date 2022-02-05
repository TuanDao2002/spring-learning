package com.khatun.roomwebapp.service;

import com.khatun.roomwebapp.data.StaffRepository;
import com.khatun.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
//    private static final List<StaffMember> staff = new ArrayList<>();
//
//    static {
//        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
//        staff.add(new StaffMember(UUID.randomUUID().toString(), "Jane", "Doe", Position.FRONT_DESK));
//        staff.add(new StaffMember(UUID.randomUUID().toString(), "Oliver", "Handle", Position.SECURITY));
//        staff.add(new StaffMember(UUID.randomUUID().toString(), "Sammy", "Smith", Position.HOUSEKEEPING));
//    }

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }



//    public List<StaffMember> getAllStaff() {return staff;}
    public List<StaffMember> getAllStaff() {return staffRepository.findAll();}

}
