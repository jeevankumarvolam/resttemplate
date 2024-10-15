/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.lastdemo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author ranadeep user_id: Joi.string().required(), game_id:
 * Joi.string().required(), game_type: Joi.string().required(), app_id:
 * Joi.number().required()
 */
public class VerifyUser {

    @Override
    public String toString() {
        return "VerifyUser{"
                + "user_id='" + user_id + '\''
                + ", game_id='" + game_id + '\''
                + ", app_id=" + app_id
                + ", game_type='" + game_type + '\''
                + '}';
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getGame_id() {
        return game_id;
    }

    public void setGame_id(String game_id) {
        this.game_id = game_id;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public String getGame_type() {
        return game_type;
    }

    public void setGame_type(String game_type) {
        this.game_type = game_type;
    }

    @JsonProperty("user_id")
    private String user_id = "hadsbuad";

    @JsonProperty("game_id")
    private String game_id = "qwetr123";

    @JsonProperty("app_id")
    private int app_id = 126;

    @JsonProperty("game_type")
    private String game_type = "carrom";

}
