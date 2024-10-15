/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.nio.charset.Charset;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author volam.kumar
 */
@Component
public class Service {

    private static final Logger logger = LogManager.getLogger();
    List<String> players = new ArrayList<>();

    private Random random = new Random();

    @Autowired
    private RestTemplate restTemplate;

    private HashMap<String, TurnTimer> turnTimers = new HashMap<>();

    int one;
    int two;
    int three;
    int four;
    int five;
    int six;
    
    public <T> List<?>  checkGenerics(List<T> list,T element){
    list.add(element);
    return list;
    } 
    
    

    Cache<String, String> cacheMap = CacheBuilder.newBuilder().build();

    HashMap<String, String> concurrentHashMap = new HashMap<String, String>() {
        {
            put("key", "value");

        }
    };

    HashMap<String, String> newMap = new HashMap<String, String>() {
        {
            put("key", "value");

        }
    };

    public void accessConcurrentMap() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        concurrentHashMap.put(generatedString, "dummyValue");

        String key = "key";
        if (concurrentHashMap.get(key) != null) {
            String value = concurrentHashMap.get("key");
            concurrentHashMap.remove(generatedString);
            //   System.out.println("value is present in map");

        } else {

            System.out.println("value is not present in map in service method");
        }

    }

    public Object throwsNullObject() {

        throw new NullPointerException();
    }

    public String throwsString() {
        throw new NullPointerException();

    }

    public int throwsmehtod() {

        throw new NullPointerException();
    }

    public void accessMap() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        newMap.put(generatedString, "dummyValue");

        if (newMap.containsKey("key")) {
            String value = newMap.get("key");
            // System.out.println("value is present in map");

        } else {

            System.out.println("value is not present in map");
        }

    }

//    private static final DiceHandler diceHandler = new DiceHandler("SIX_DICE_NUMBERS");
//    public String testMethod() {
//
//        for (int i = 0; i < 100; i++) {
//            int generatedNumber = diceHandler.getDiceNumber();
//
//            switch (generatedNumber) {
//                case 1:
//                    one++;
//                    break;
//
//                case 2:
//                    two++;
//                    break;
//                case 3:
//                    three++;
//                    break;
//                case 4:
//                    four++;
//                    break;
//                case 5:
//                    five++;
//                    break;
//                case 6:
//                    six++;
//                    break;
//                default:
//                    System.out.println("no number got generated");
//
//            }
//
//        }
//
//        System.out.println("The number of one's generated are " + one);
//        System.out.println("The number of two's generated are " + two);
//        System.out.println("The number of three's generated are " + three);
//        System.out.println("The number of four's generated are " + four);
//        System.out.println("The number of five's generated are " + five);
//        System.out.println("The number of six's generated are " + six);
//
//        return "success";
//
//    }
    public HashMap<String, TurnTimer> getTurnTimers() {
        return turnTimers;
    }

    public void setTurnTimers(HashMap<String, TurnTimer> turnTimers) {
        this.turnTimers = turnTimers;
    }

    public Service() {

        players.add("pavan");

    }

    public void removePlayers() {
        players.clear();

    }

    public void generateGameId() {
//        char startChar = 65;
//        char endChar = 90;
//
//        StringBuilder randomString = new StringBuilder();

//        for (int i = 0; i < 5; i++) {
//            int randomIndex = startChar + random.nextInt(endChar - startChar + 1);
//            if (randomIndex == 79) {
//
//                randomIndex -= random.nextInt(13)+1;
//
//            }
//            randomString.append((char) randomIndex);
//        }
//        startChar = 49;
//        endChar = 57;
//        for (int i = 0; i < 3; i++) {
//            int randomIndex = startChar + random.nextInt(endChar - startChar + 1);
//            randomString.append((char) randomIndex);
//        }
//
//        System.out.println(randomString.toString());
//        
        Instant utcTime = Instant.now();
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZonedDateTime istDateTime = ZonedDateTime.ofInstant(utcTime, istZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMM");
        String istString = istDateTime.format(formatter);

        System.out.println("IST Time: " + istString);

//        
//        for(int i=0;i<128;i++){
//        
//        System.out.println("the character value of asci is"+i+": "+(char)i);
//        
//        }
//        
    }

    public void getMethod() {
    }

    public void postMethod() {
    }

    public void cpuFix() throws InterruptedException {

        MutableBoolean isAllTakeSeatSuccess = new MutableBoolean(false);

        loopMethod(isAllTakeSeatSuccess, players);
        System.out.println("boolean value is" + isAllTakeSeatSuccess);

    }

    public void loopMethod(MutableBoolean isAllTakeSeatSuccess, List<String> players) throws InterruptedException {

        if (players.isEmpty()) {
            System.out.println("in players empty block");
            isAllTakeSeatSuccess.setTrue();

        } else {
            Thread.sleep(10);
            System.out.println("in loop ");

            loopMethod(isAllTakeSeatSuccess, players);
        }

    }

}
