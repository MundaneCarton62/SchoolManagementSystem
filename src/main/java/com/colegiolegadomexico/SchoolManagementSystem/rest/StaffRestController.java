//package com.colegiolegadomexico.SchoolManagementSystem.rest;
//
//import com.colegiolegadomexico.SchoolManagementSystem.entity.Staff;
//import com.colegiolegadomexico.SchoolManagementSystem.service.StaffService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/staff")
//public class StaffRestController {
//
//
//    private StaffService staffService;
//
//    @Autowired
//    public StaffRestController(StaffService theStaffService){
//        staffService = theStaffService;
//    }
//
//
//    // expose "/staff" and return a list of staff members
//    @GetMapping("/")
//    public List<Staff> findAll() {
//        return staffService.findAll();
//    }
//
//    @GetMapping("/staff/{id}")
//    public Staff getStaff(@PathVariable Integer staffId) {
//        Staff theStaff = staffService.findById(staffId);
//
//        if(theStaff == null){
//            throw new RuntimeException("Did not found the Staff memeber with Id - " + staffId);
//        }
//
//        return theStaff;
//    }
//
//    // add mapping for POST /staff - add new staff member
//    @PostMapping
//    public Staff addStaff(@RequestBody Staff theStaff) {
//        // also just in case they pass an id in JSON ... set id to 0
//        // this is to force a save of new item ... instead of update
//        theStaff.setId(0);
//
//        Staff dbStaff = staffService.save(theStaff);
//
//        return dbStaff;
//    }
//
//
//    // add mapping for PUT /staff - update an existing employee
//    @PutMapping("/")
//    public Staff updateStaff(@RequestBody Staff theStaff) {
//
//        Staff dbStaff = staffService.save(theStaff);
//
//        return dbStaff;
//    }
//
//
//    // add mapping for DELETE /staff/{staffId} - delete staff member
//    @DeleteMapping("/{staffId}")
//    public String deleteStaff(@PathVariable Integer staffId) {
//        Staff tempStaff = staffService.findById(staffId);
//
//        //throw exception if null
//
//        if(tempStaff == null){
//            throw new RuntimeException("Staff id not found - " + staffId);
//        }
//
//        staffService.deleteById(staffId);
//
//        return "Deleted staff memeber with id - " + staffId;
//    }
//}
//
