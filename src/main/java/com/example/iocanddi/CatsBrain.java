package com.example.iocanddi;

import org.springframework.stereotype.Component;

@Component(value = "cat")
public class CatsBrain implements Brain {

    @Override
    public void think() {
        System.out.println("CatsBrain");
    }

}
