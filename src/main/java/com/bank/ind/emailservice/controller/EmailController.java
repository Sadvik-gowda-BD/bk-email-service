package com.bank.ind.emailservice.controller;

import com.bank.ind.emailservice.dto.EmailDto;
import com.bank.ind.emailservice.dto.SendResponse;
import com.bank.ind.emailservice.service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailController {

    EmailService emailService;


    //@Autowired  - Here autowire is optional because there is only one constructor so spring inject bean automatically
    //We can use AllArgsConstructor as well
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public ResponseEntity<SendResponse> sendEmail(@RequestBody EmailDto emailDto) {
        //SendResponse response = emailService.sendSimpleEmail(emailDto);

        SendResponse response = emailService.sendEmail(emailDto);

        if (response.isSendStatus()) {
            return ResponseEntity.ok(response);
        }
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}

