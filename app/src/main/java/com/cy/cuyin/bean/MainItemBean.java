package com.cy.cuyin.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/6.
 */

public class MainItemBean implements Serializable {

    int image;
    String name;

    public MainItemBean(){

    }

    public MainItemBean(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
