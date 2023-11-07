package com.erp.system.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.system.model.Email;
import com.erp.system.model.dto.EmailDTO;
import com.erp.system.service.EmailService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDTO emailDTO) {
        Email email = new Email();
        BeanUtils.copyProperties(emailDTO, email);
        emailService.sendEmail(email);
        return ResponseEntity.ok(email);
    }

    
}
