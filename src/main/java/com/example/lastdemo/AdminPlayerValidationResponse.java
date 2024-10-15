/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

/**
 *
 * @author volam.kumar
 */
public class AdminPlayerValidationResponse {

    private String playerName;
    private String segmentName;
    private boolean isPlayerValid;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public boolean isIsPlayerValid() {
        return isPlayerValid;
    }

    public void setIsPlayerValid(boolean isPlayerValid) {
        this.isPlayerValid = isPlayerValid;
    }

    @Override
    public String toString() {
        return "AdminPlayerValidationResponse{" + "playerName=" + playerName + ", segmentName=" + segmentName + ", isPlayerValid=" + isPlayerValid + '}';
    }

}
