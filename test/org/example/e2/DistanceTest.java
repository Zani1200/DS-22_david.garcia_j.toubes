package org.example.e2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DistanceTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void seatingPeopleCorrect(){
        char[][] classInicial = {
                {'A','.','A','A','.'},
                {'A','A','A','A','A'},
                {'A','.','A','.','A'},
                {'A','A','A','A','.'},
                {'A','.','A','A','.'},
        };

        char[][] classFinal = {
                {'#','.','#','A','.'},
                {'#','A','#','A','#'},
                {'A','.','#','.','#'},
                {'#','A','A','A','.'},
                {'#','.','A','#','.'},
        };

        assertArrayEquals(Distance.seatingPeople(classInicial),classFinal);
    }

    @Test
    void testException(){
        char[][] classInicial = {
                {'A','.','A','A','.'},
                {'A','A','Ñ','A','A'},
                {'A','.','A','.','A'},
                {'A','A','A','A','.'},
                {'A','.','A','A','.'},
        };

        assertThrows(IllegalArgumentException.class, () -> Distance.seatingPeople(classInicial));
    }
}
