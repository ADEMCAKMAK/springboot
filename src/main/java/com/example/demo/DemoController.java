package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value = "sample", method = RequestMethod.GET)
    public ResponseEntity<?> sample() {
        //custom logic
        LOGGER.info("info logger");
        LOGGER.debug("debug logger");
        LOGGER.trace("trace logger");
        LOGGER.error("error logger");
        return ResponseEntity.ok(1);
    }
}
