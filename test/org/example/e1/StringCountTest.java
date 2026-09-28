package org.example.e1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void countWords() {
        Assertions.assertEquals(StringCount.countWords("hola que tal"), 3);
    }

    @Test
    void countChar() {
        assertEquals(StringCount.countChar("holA que tal", 'a'), 1);
    }

    @Test
    void countCharIgnoringCase() {
        assertEquals(StringCount.countCharIgnoringCase("holA que tal", 'a'), 2);
    }

    @Test
    void isPasswordSafe() {
        assertTrue(StringCount.isPasswordSafe("Davidgarcí%1"));
    }
}