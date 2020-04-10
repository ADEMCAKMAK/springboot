package com.example.demo.rest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "demo")
public class SampleController {

    @RequestMapping(value = "sample", method = RequestMethod.GET)
    public ResponseEntity<?> sample() {
        //custom logic
        return ResponseEntity.ok(1);
    }
}
