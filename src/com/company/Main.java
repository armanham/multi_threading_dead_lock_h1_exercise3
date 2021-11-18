package com.company;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Aro");
        Human human2 = new Human("Abo");

        new Thread(() -> {
            human1.call(human2);
        }).start();

        new Thread(() -> {
            human2.call(human1);
        }).start();
    }
}
