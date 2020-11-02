package com.example.demo;

import localhost._8090.soapws.SendMailRequest;
import localhost._8090.soapws.SendMailResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class SendMailEndpoint {

    @PayloadRoot(namespace = ConfigParam.NAMESPACE_URI, localPart = "SendMailRequest")
    @ResponsePayload
    public SendMailResponse getCountry(@RequestPayload SendMailRequest request) {
        SendMailResponse response = new SendMailResponse();
        response.setResult("success!!!");
        return response;
    }
}
