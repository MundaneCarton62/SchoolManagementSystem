package com.colegiolegadomexico.SchoolManagementSystem.service;

import com.colegiolegadomexico.SchoolManagementSystem.dao.StaffRepository;
import com.colegiolegadomexico.SchoolManagementSystem.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService{

    private StaffRepository staffRepository;

    @Autowired
    public StaffServiceImpl(StaffRepository theStaffRepository){
        staffRepository = theStaffRepository;
    }


    @Override
    public List<Staff> findAll() {
        return staffRepository.findAll();
    }

    @Override
    public Staff findById(int theId) {
        Optional<Staff> result = staffRepository.findById(theId);

        Staff theStaff = null;

        if(result.isPresent()){
            theStaff = result.get();
        }
        else {
            //we didn't find the staff member
            throw new RuntimeException("Did not found the Staff memeber with Id - " + theId);
        }

        return theStaff;
    }

    @Override
    public Staff save(Staff theStaff) {
        return staffRepository.save(theStaff);
    }

    @Override
    public void deleteById(int theId) {
        staffRepository.deleteById(theId);
    }
}
