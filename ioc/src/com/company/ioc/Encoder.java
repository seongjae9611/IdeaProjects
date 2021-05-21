package com.company.ioc;

import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        //this.iEncoder = new Base64Encoder();
        //this.iEncoder = new UrlEncoder();
        this.iEncoder = iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }

}
