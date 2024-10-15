/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author volam.kumar
 */
public class AppClient {

    private final String id;
    private final String teamId;
    private final PrivateKey privateKey;
    private final String kid;

    public String getId() {
        return id;
    }

    public String getTeamId() {
        return teamId;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public String getKid() {
        return kid;
    }

    public AppClient(String id, String teamId, String privateKeyPath, String kid) throws Exception {
        this.id = id;
        this.teamId = teamId;
        this.kid = kid;

        // Read the private key from the specified path
        String key = "-----BEGIN PRIVATE KEY-----\n"
                + "MIGTAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBHkwdwIBAQQgozO7l0iIMCLJ8cp8\n"
                + "oHK9WhLPLo2P1xWtroYbhnb2jQqgCgYIKoZIzj0DAQehRANCAAQBx3NSc3j884G/\n"
                + "x3e2AFPz+u/31hwZsmYfLIaUvV+gdopre+Iw9giRL3pT0arKWYkCZDDgJH+VoARG\n"
                + "B5xtTrY5\n"
                + "-----END PRIVATE KEY-----";
        byte[] keyBytes = key.getBytes();

        System.out.println("reached post reading file");
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        System.out.println("reached post keyspec");
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        System.out.println("reached post keyfactory" + keySpec);
        this.privateKey = keyFactory.generatePrivate(keySpec);
        System.out.println("reached post assigning private key");
    }

    public String generateSecret() {
        Map<String, Object> header = new HashMap<>();
        header.put("alg", "ES256");
        header.put("kid", kid);

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        long expirationMillis = nowMillis + 24 * 60 * 60 * 1000; // 1 day
        Date expiration = new Date(expirationMillis);
        return ";";

//        return Jwts.builder()
//                .setHeader(header)
//                .setIssuer(teamId)
//                .setIssuedAt(now)
//                .setExpiration(expiration)
//                .setAudience("https://appleid.apple.com")
//                .setSubject(id)
//                .signWith(SignatureAlgorithm.ES256, privateKey)
//                .compact();
    }
}
