package org.example;

public class PlayerCharacter {
    static int y = 0;
    static  int x = 0;
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(char caller) {
        if(caller=='w'){
            y++;
        }
    }
}