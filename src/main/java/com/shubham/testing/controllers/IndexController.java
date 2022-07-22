package com.shubham.testing.controllers;

public class IndexController {
    public String index(){
        return "index";
    }

    public String oopsHandler(){
        return "notimplemented";
    }

    public String oopsHandlerException(){
        throw  new ValueNotFoundException();
    }
}
