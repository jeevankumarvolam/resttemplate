/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author srivarun
 */
public class TakeSeatRequest {

    @JsonProperty("app_id")
    private int appId;

    @JsonProperty("pool_id")
    private String poolId;

    @JsonProperty("game_id")
    private String gameId;

    @JsonProperty("user_id")
    private String userId;

    private String state;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TakeSeatRequest{" + "appId=" + appId + ", poolId=" + poolId + ", gameId=" + gameId + ", userId=" + userId + ", state=" + state + '}';
    }

}
