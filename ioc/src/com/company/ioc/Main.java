package com.company.ioc;

public class Main {

    public static void main(String[] args) {
        String url = "wwwm.naver.com/books/it?page=10&size=20&name=spring-boot";

        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);

//        UrlEncoder urlEncoder = new UrlEncoder();
//        String urlResult = urlEncoder.encode(url);

	    System.out.println(result);

    }
}
