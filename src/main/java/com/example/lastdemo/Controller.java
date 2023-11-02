/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import java.net.URISyntaxException;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author volam.kumar
 */
@RestController
public class Controller {

    @Autowired
    private Service service;
    @Autowired
    private PlatformService platformService;



    @Autowired
    private ApplicationContext context;
    @Autowired
    private TakeSeatApi takeSeatApi;

    @Autowired
    private TurnTimer turnTimer;

    private String url = "http://localhost:8080/checkPost";

    @GetMapping("/check")
    public String testMethod() {
        service.getTurnTimers().get("gameId").setTurnTime(service.getTurnTimers().get("gameId").getTurnTime() + 2);

        return "success";

    }

    @GetMapping("/checkRestTemplate")
    public void checkRest() throws URISyntaxException {

        String requestBody="the request jeeevan sending is";

        VerifyUser verifyUser=new VerifyUser();

      System.out.println(  platformService.post(url, requestBody, new LinkedMultiValueMap<>(), verifyUser));
    }

    @GetMapping("/thread")
    public String threadMethod() throws Exception {
        TakeSeatApi takeThread = (TakeSeatApi) context.getBean("takeSeatApi");
        takeThread.call();
        return "thread started";

    }

    @GetMapping("/gameId")
    public String gameIdLoop() {
        double b = 1.333;

        System.out.println(b);

        return "gameId's generated started";

    }

    @GetMapping("/addPlayers")
    public void addPlayers() throws InterruptedException {

        service.cpuFix();

    }

    @GetMapping("/removePlayers")
    public void removePlayers() {

        service.removePlayers();
    }

}
