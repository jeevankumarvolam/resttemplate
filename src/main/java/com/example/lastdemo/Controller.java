/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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
    private UnCaughtExceptionHandler unCaughtExceptionHandler;

    @Autowired
    @Lazy
    private Player player;

    @Autowired
    private ApplicationContext context;
    @Autowired
    private TakeSeatApi takeSeatApi;

    @Autowired
    private TurnTimer turnTimer;

    private String url = "http://localhost:8080/checkPost";

    private int i = 0;

    @GetMapping("/checkSparkAws")
    public String checkSpark() {

        return "recieved get request successfully";

    }

    @GetMapping("/handleAspect")
    public String handleAspect() {

        System.out.println(player.toString());
        player.setName("niharika");

        return "invoked aspect advices";

    }

    

    @GetMapping("/check")
    public void testMethod() throws Exception {
        // service.getTurnTimers().get("gameId").setTurnTime(service.getTurnTimers().get("gameId").getTurnTime() + 2);

//       ExecutorService executorService=Executors.newFixedThreadPool(40);
//        for(int i=0;i<10;i++){
//        executorService.execute(()->{
//        while(true){
//        service.accessConcurrentMap();
//        }
//        
//        });
//        
//        
//        
//        }
        ExecutorService service = Executors.newSingleThreadExecutor();
        //  for (int i = 0; i < 11; i++) {
        service.execute(() -> {

            try {
                Thread.setDefaultUncaughtExceptionHandler(unCaughtExceptionHandler);
                throw new NullPointerException();
            } catch (Exception ex) {
                System.out.println("caught exception in catch block");
            }
            System.out.println("after catch block");
            //  System.out.println("after throwing exceptions");
//        if (true) {
//            throw new NullPointerException();
//        }
        });
        // }

        service.shutdown();

//throw new Exception();
//        return "success";
    }

//    public int returnmethod(){
//    
//    try{
//    return 10;
//    }
//    catch(Exception ex){}
//    
//    }
    @PostMapping("/post")
    public void recievePostRequest(@RequestBody Object requestBody, @RequestHeader Map<String, String> headers) {
        System.out.println("recievedd post request");
        StringBuilder result = new StringBuilder();
        headers.forEach((key, value) -> {

            System.out.println("the key is:" + key);
            System.out.println("the value is:" + value);
        });
        System.out.println(requestBody.toString());
        System.out.println(result.toString());

    }

    @SuppressWarnings("unchecked")
    public ResponseEntity<AdminPlayerValidationResponse> handlePostRequest() {

        AdminPlayerValidationResponse adminPlayerValidationResponse = new AdminPlayerValidationResponse();

        adminPlayerValidationResponse.setIsPlayerValid(true);
        adminPlayerValidationResponse.setPlayerName("dev20");
        adminPlayerValidationResponse.setSegmentName("deummy");
        if (i < 3) {
            i++;
            return new ResponseEntity<>(adminPlayerValidationResponse, HttpStatus.BAD_GATEWAY);

        } else {

            return new ResponseEntity<>(adminPlayerValidationResponse, HttpStatus.OK);

        }
    }

    @GetMapping("/checkRestTemplate")
    public void checkRest() throws URISyntaxException {

        String requestBody = "the request jeeevan sending is";

        VerifyUser verifyUser = new VerifyUser();

        System.out.println(platformService.post(url, requestBody, new LinkedMultiValueMap<>(), verifyUser));
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
