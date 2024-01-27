package org.dbonhard;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Slf4j
public class AdventDay1 {

    public static BigInteger getCoordinates(String path) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(path));) {
            Optional<BigInteger> reduce =
                    fileReader.lines()
                            .map(AdventDay1::getCoordinate)
                            .reduce(BigInteger::add);
            if (reduce.isEmpty()) {
                log.info("no parsable coordinates");
                return null;
            }
            return reduce.get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static BigInteger getCoordinates(List<String> input) {
        Optional<BigInteger> reduce = input.stream()
                .map(AdventDay1::getCoordinate)
                .reduce(BigInteger::add);
        if (reduce.isEmpty()) {
            log.info("no parsable coordinates");
            return null;
        }
        return reduce.get();
    }

    private static BigInteger getCoordinate(String line) {
        StringBuilder firstHalfOfCoordinate = new StringBuilder();

        int index = 0;
        while (index < line.length() && !Character.isDigit(line.charAt(index))) {
            index++;
        }
        while (index < line.length() && Character.isDigit(line.charAt(index))) {
            firstHalfOfCoordinate.append(line.charAt(index));
            index++;
        }
        index = line.length() - 1;
        StringBuilder secondHalfOFCoordinate = new StringBuilder();
        while (0 < index && !Character.isDigit(line.charAt(index))) {
            index--;
        }
        while (0 < index && Character.isDigit(line.charAt(index))) {
            secondHalfOFCoordinate.append(line.charAt(index));
            index--;
        }
        return BigInteger.valueOf(Long.parseLong(firstHalfOfCoordinate.append(secondHalfOFCoordinate.reverse()).toString()));
    }

}
