package com.sidenis.qaacademy.restassured.controller;

import io.restassured.specification.RequestSpecification;

/**
 * Started by ML on 9/2/2018.
 */
public abstract class Controller {
    private RequestSpecification rs;
    private String basePath;

    public Controller(String basePath) {
        this.basePath = basePath;
    }

    public RequestSpecification getRs() {
        return rs;
    }

    public void setRs(RequestSpecification rs) {
        this.rs = rs;
    }
}
