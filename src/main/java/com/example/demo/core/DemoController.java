package com.example.demo.core;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController(value = "demo")
public class DemoController {


    @RequestMapping(value = "request-part", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> create(@RequestPart(value = "document") Document document,
                                    @RequestPart(value = "file") MultipartFile file) {
        //custom logic
        return ResponseEntity.ok(document);
    }
}
