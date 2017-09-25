package com.examples.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Vitaliy Saliy
 */
@RestController
@RequestMapping("/api")
@ConfigurationProperties(prefix = "helloapp")
public class HolaRestController {

    private String saying;

//    private String backendServiceHost;
//
//    private int backendServicePort;

//    @RequestMapping(value = "/greeting",
//            method = RequestMethod.GET, produces = "text/plain")
//    public String greeting() {
//        String backendServiceUrl =
//                String.format(
//                        "http://%s:%d/hello?greeting={greeting}",
//                        backendServiceHost, backendServicePort);
//        System.out.println("Sending to: " + backendServiceUrl);
//        return backendServiceUrl;
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/hola",
            produces = "text/plain")
    public String hola() throws UnknownHostException {
        String hostname = null;
        try {
            hostname = InetAddress.getLocalHost()
                    .getHostAddress();
        } catch (UnknownHostException e) {
            hostname = "unknown";
        }
        return saying + " " + hostname;
    }

    public String getSaying() {
        return saying;
    }

    public void setSaying(String saying) {
        this.saying = saying;
    }

//    public String getBackendServiceHost() {
//        return backendServiceHost;
//    }
//
//    public void setBackendServiceHost(String backendServiceHost) {
//        this.backendServiceHost = backendServiceHost;
//    }
//
//    public int getBackendServicePort() {
//        return backendServicePort;
//    }
//
//    public void setBackendServicePort(int backendServicePort) {
//        this.backendServicePort = backendServicePort;
//    }
}
