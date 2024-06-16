package com.bank.ind.emailservice.service;

import com.bank.ind.emailservice.dto.EmailDto;
import com.bank.ind.emailservice.dto.SendResponse;

public interface EmailService {

    SendResponse sendSimpleEmail(EmailDto emailDto);

    SendResponse sendEmail(EmailDto emailDto);
}
