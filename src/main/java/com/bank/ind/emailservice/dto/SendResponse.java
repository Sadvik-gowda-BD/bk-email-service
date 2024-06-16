package com.bank.ind.emailservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Builder
public class SendResponse {
    private boolean sendStatus;
    private String errorMessage;
}
