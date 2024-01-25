package org.example;

import org.junit.jupiter.api.Test;

import static org.example.PlayerCharacter.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerCharacterTest {

    @Test
    void getX_whenGameStarts_thenPlayerPositionedInTheMiddleOfField() {
        int expected = 0;
        int actual = PlayerCharacter.getX();
        assertEquals(0, actual);
    }

    @Test
    void getY_returnsValue0() {
        int expected = 0;
        int actual = PlayerCharacter.getY();
        assertEquals(0, actual);
    }

    @Test
    void move_whenWIsCalled_ThenGameCharacterMovesOnePositionUp() {
        char caller = 'w';
        int y = 0;
        int expected = y + 1;
        int actual = PlayerCharacter.move(caller);
        assertEquals(expected, actual);
    }


}