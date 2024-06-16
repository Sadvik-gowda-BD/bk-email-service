package com.bank.ind.emailservice.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
public class EmailDto {

    private String fromAddress;
    private String toAddress;
    private String subject;
    private String body;
}
