package com.example.PM.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PM.entity.Admin;
import com.example.PM.repository.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	public AdminRepo aRepo;
	
	// Add/Insert new admin
    public Admin addAdmin(Admin admin) {
        return aRepo.save(admin);
    }

    // Get all admins
    public List<Admin> getAllAdmins() {
        return aRepo.findAll();
    }

    // Get admin by ID
    public Optional<Admin> getAdminById(int id) {
        return aRepo.findById(id);
    }

    // Delete admin
    public void deleteAdmin(int id) {
        aRepo.deleteById(id);
    }

    // Update admit
    public Admin updateAdmin(Admin admin) {
        Admin existingAdmin = aRepo.findById(admin.getId()).orElseThrow(() -> 
            new RuntimeException("Admin not found with id: " + admin.getId())
        );

        existingAdmin.setName(admin.getName());
        existingAdmin.setEmail(admin.getEmail());
        existingAdmin.setPassword(admin.getPassword());
        existingAdmin.setRole(admin.getRole());

        return aRepo.save(existingAdmin);
    }

    // Check if admin exists
    public boolean existsById(Integer id) {
        return aRepo.existsById(id);
    }
	
	

}

