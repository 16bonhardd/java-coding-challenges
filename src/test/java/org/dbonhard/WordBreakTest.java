package org.dbonhard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordBreakTest {


    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("applepenapple", List.of("apple", "pen"), true),
                Arguments.of("leetcode", List.of("leet", "code"), true),
                Arguments.of("catsandog", List.of("cats", "dog", "sand", "and", "cat"), false),
                Arguments.of("aaaaaaa", List.of("aaaa", "aaa"), true),
                Arguments.of("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                        List.of("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"), false)
        );
    }

    @ParameterizedTest
    @MethodSource("examples")
    void test(String word, List<String> dictionary, Boolean valid) {
        assertEquals(valid, WordBreak.solution(word, dictionary));
    }

}