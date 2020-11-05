package com.example.demo;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RestController
@RequestMapping(value = "/test")
public class RestSendingMailController {

    @RequestMapping(value = "/sendMail")
    public SendMailResponseDTO sendMail(@RequestBody Object requestDTO){

        SendMailResponseDTO sendMailResponseDTO = new SendMailResponseDTO();
        sendMailResponseDTO.setResult("success");
        System.out.println();
        return sendMailResponseDTO;
    }

    @RequestMapping(value = "request-part", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> create(@RequestPart(value = "document") Document document,
                                    @RequestPart(value = "file") MultipartFile file) throws FileNotFoundException {

        return ResponseEntity.ok(document);
    }
}
