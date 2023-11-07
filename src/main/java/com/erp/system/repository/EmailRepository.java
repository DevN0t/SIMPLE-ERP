package com.erp.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.system.model.Email;

public interface EmailRepository extends JpaRepository<Email, Integer>{
    
}
