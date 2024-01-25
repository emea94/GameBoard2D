package org.example;

public class PlayerCharacter {
    static int characterPositionY = 0;
    static int characterPositionX = 0;
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static void gameStart(){
        characterPositionX = 0;
        characterPositionY = 0;
    }

    public static int getX() {
        return characterPositionX;
    }

    public static int getY() {
        return characterPositionY;
    }

    public static void move(char caller) {
        if(caller=='w'){
            characterPositionY++;
        }
        if(caller=='s'){
            characterPositionY--;
        }
        if(caller=='a'){
            characterPositionX--;
        }
        if(caller=='d'){
            characterPositionX++;
        }
    }
}