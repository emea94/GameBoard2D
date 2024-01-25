package org.example;

import org.junit.jupiter.api.Test;

import static org.example.PlayerCharacter.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void gameStart_whenGameStart_CharacterPosition00() {
        int[] expected = {0,0};

        gameStart();

        int[] actual = {PlayerCharacter.getX(), PlayerCharacter.getY()};

        assertArrayEquals(expected, actual);
    }

    @Test
    void move_whenWIsCalled_ThenGameCharacterMovesOnePositionUp() {
        char caller = 'w';
        int expected = PlayerCharacter.getY() + 1;

        PlayerCharacter.move(caller);
        int actual = PlayerCharacter.getY();

        assertEquals(expected, actual);
    }

    @Test
    void move_whenSIsCalled_ThenGameCharacterMovesOnePositionDown() {
        char caller = 's';
        int expected = PlayerCharacter.getY() - 1;

        PlayerCharacter.move(caller);
        int actual = PlayerCharacter.getY();

        assertEquals(expected, actual);
    }
    @Test
    void move_whenAIsCalled_ThenGameCharacterMovesOnePositionLeft() {
        char caller = 'a';
        int expected = PlayerCharacter.getX() - 1;

        PlayerCharacter.move(caller);
        int actual = PlayerCharacter.getX();

        assertEquals(expected, actual);
    }

    @Test
    void move_whenDIsCalled_ThenGameCharacterMovesOnePositionRight() {
        char caller = 'd';
        int expected = PlayerCharacter.getX() + 1;

        PlayerCharacter.move(caller);
        int actual = PlayerCharacter.getX();

        assertEquals(expected, actual);
    }




}