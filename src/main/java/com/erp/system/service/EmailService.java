package com.erp.system.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.erp.system.enums.StatusEmail;
import com.erp.system.model.Email;
import com.erp.system.model.dto.EmailDTO;
import com.erp.system.repository.EmailRepository;

@Service
public class EmailService {


    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;


    public Email sendEmail(@RequestBody Email email){
       email.setSendDateEmail(LocalDateTime.now());

       try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(email.getEmailFrom());
            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getText());
            emailSender.send(message);

            email.setStatusEmail(StatusEmail.SENT);
        } catch (MailException e) {
            email.setStatusEmail(StatusEmail.ERROR);
        } finally {
            return emailRepository.save(email);
       }
    }


    
}
