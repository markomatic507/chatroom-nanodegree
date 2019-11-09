package edu.udacity.java.nano.chat;

import com.alibaba.fastjson.JSON;

/**
 * WebSocket message model
 */
public class Message {
    private String username;
    private String msg;
    private int onlineCount;
    private String type;

    public Message(String username, String msg, int onlineCount, String type) {
        this.username = username;
        this.msg = msg;
        this.onlineCount = onlineCount;
        this.type = type;
    }

    public static String Json(String username, String msg, int onlineCount, String type) {
        return JSON.toJSONString(new Message(username, msg, onlineCount, type));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
