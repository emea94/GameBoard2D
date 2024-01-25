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
}