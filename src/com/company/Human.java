package com.company;

public class Human {
    private final String name;

    public Human(String string) {
        this.name = string;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void call(Human human){
        System.out.println(this.name + ": has called to me! " + human.getName());
        human.callBack(this);
    }

    public synchronized void callBack(Human human) {
        System.out.println(this.name + ": has called back to me! " + human.getName());
    }
}
