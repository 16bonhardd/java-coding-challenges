package org.dbonhard;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class WordBreak {



    public static boolean solution(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        Boolean[][] memo = new Boolean[s.length()][s.length()];
        return solutionHelper(s, words, 0, 1, memo);
    }

    private static boolean solutionHelper(String s, Set<String> words, Integer start, Integer end, Boolean[][] memo) {
        if (s.length() == end - 1 && start == end - 1) {
            return true;
        }
        if (s.length() == end - 1 && start != end - 1) {
            return false;
        }
        if (memo[start][end - 1] != null) {
            return memo[start][end - 1];
        }
        String substring = s.substring(start, end);
        if (words.contains(substring)) {
            log.info("found: {}", substring);
            memo[start][end - 1] = solutionHelper(s, words, end, end + 1, memo) || solutionHelper(s, words, start, end + 1, memo);
            return memo[start][end - 1];
        }

        log.info("did not find: {}", substring);
        memo[start][end - 1] = solutionHelper(s, words, start, end + 1, memo);
        return memo[start][end - 1];
    }


}
