package com.example.PM.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PM.entity.Admin;
import com.example.PM.service.AdminService;

//Class that communicates with postman
//postman-> controller -> service -> repository -> database(execution flow)
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
    public AdminService aSvr;
	
	 //Create new admin
  @PostMapping("/addadmin")
  public Admin addAdmin(@RequestBody Admin admin) {
      return aSvr.addAdmin(admin);
  }

  // Get all admins
  @GetMapping("/getall")
  public List<Admin> getAllAdmins() {
      return aSvr.getAllAdmins();
  }

  // Get admin by ID
  @GetMapping("/getbyid/{id}")
  public Optional<Admin> getAdminById(@PathVariable int id) {
      return aSvr.getAdminById(id);
  }

  // Update admin
  @PutMapping("/update/{id}")
  public Admin updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
      admin.setId(id); // make sure path ID is applied
      return aSvr.updateAdmin(admin);
  }

  // Delete admin
  @DeleteMapping("/deleteadmin/{id}")
  public String deleteAdmin(@PathVariable int id) {
      aSvr.deleteAdmin(id);
      return "Admin with ID " + id + " deleted successfully.";
  }

  // Check if admin exists
  @GetMapping("/exists/{id}")
  public boolean existsById(@PathVariable int id) {
      return aSvr.existsById(id);
  }

}
