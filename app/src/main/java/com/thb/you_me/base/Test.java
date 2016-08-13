package com.thb.you_me.base;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/12 0012.
 */
public class Test implements Serializable {
    private String id;
    private String name;
    private String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
