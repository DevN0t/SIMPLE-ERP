package com.erp.system.model;

import java.time.LocalDateTime;

import com.erp.system.enums.StatusEmail;
import com.erp.system.model.dto.EmailDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_email")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private Integer emailId;

    @Column(name = "owner_ref")
    private String ownerRef;

    @Column(name = "email_from")
    private String emailFrom;

    @Column(name = "email_to")
    private String emailTo;

    @Column(name = "email_subject")
    private String subject;


    @Column(columnDefinition = "TEXT", name = "email_text")
    private String text;

    @Column(name = "send_date_email")
    private LocalDateTime sendDateEmail;

    @Column(name = "status_email")
    private StatusEmail statusEmail;

 
}
