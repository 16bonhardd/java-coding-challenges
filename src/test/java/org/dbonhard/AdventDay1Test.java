package org.dbonhard;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;


@Slf4j
class AdventDay1Test {

    private final List<String> input = List.of("1abc2",
            "pqr3stu8vwx",
            "a1b2c3d4e5f",
            "treb7uchet");

    @Test
     void testGetCordinates() {
        BigInteger coordinates = AdventDay1.getCoordinates(input);

        log.info("calculated {}", coordinates);
    }

    @Test
    void testGetFromFile(){
        BigInteger coordinates = AdventDay1.getCoordinates("/home/dbonhard/projects/javaCodingChallenges/IdeaHelloWorld/src/test/resources/Advent/Day1/input.txt");

        log.info("calculated {}", coordinates);
    }

}