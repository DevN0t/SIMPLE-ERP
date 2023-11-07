package com.erp.system.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmailDTO(

    @NotBlank
    String ownerRef,
    @NotBlank
    @Email
    String emailFrom,
    @Email
    @NotBlank
    String emailTo,
    @NotBlank
    String subject,
    @NotBlank
    String text

) {
    
}
