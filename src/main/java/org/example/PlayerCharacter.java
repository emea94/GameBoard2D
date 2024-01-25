package org.example;

public class PlayerCharacter {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static int move(char caller) {
        int y = getY();
        return caller == 'w' ? y + 1 : 0;
    }
}