package com.example.demo;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class RestSendingMailController {

    @RequestMapping(value = "/sendMail")
    public SendMailResponseDTO sendMail(@RequestBody SendMailRequestDTO requestDTO){

        SendMailResponseDTO sendMailResponseDTO = new SendMailResponseDTO();
        sendMailResponseDTO.setResult("success");

        return sendMailResponseDTO;
    }
}
