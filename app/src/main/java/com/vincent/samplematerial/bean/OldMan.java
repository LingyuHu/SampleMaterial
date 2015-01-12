package com.vincent.samplematerial.bean;

/**
 * Created by Administrator on 2015/1/6.
 */
public class OldMan {
    private String name;
    private int avatar;

    public OldMan(String name, int avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
