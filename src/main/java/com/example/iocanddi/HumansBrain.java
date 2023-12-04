package com.example.iocanddi;

import org.springframework.stereotype.Component;


//@Primary
@Component(value = "human")
public class HumansBrain implements Brain {

    @Override
    public void think() {
        System.out.println("HumansBrain");
    }
}
