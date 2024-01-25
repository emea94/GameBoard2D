package org.example;

import java.util.Scanner;

public class PlayerCharacter {
    static int characterPositionY = 0;
    static int characterPositionX = 0;
    public static void main(String[] args) {
        Scanner playerMove = new Scanner(System.in);
        while(true) {
            System.out.println("Press wasd to move.");
            char input = playerMove.next().charAt(0);
            if(input == 'q') break;
            move(input);
            System.out.format("[%3d]  [%3d]\n", characterPositionX, characterPositionY);
        }
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