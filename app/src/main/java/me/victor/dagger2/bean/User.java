package me.victor.dagger2.bean;

import javax.inject.Inject;

public class User {
    public String name;

    @Inject
    User() {
        this.name = "Leon";
    }
}
